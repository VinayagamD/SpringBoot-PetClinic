package com.vinaylogics.springbootpetclinic.services.springdatajpa;

import com.vinaylogics.springbootpetclinic.models.Owner;
import com.vinaylogics.springbootpetclinic.repositories.OwnerRepository;
import com.vinaylogics.springbootpetclinic.repositories.PetRepository;
import com.vinaylogics.springbootpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith({MockitoExtension.class})
class OwnerSDJpaServiceTest {
    public static final String LAST_NAME = "smith";
    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService service;

    Owner returnOwner;
    @BeforeEach
    void setUp() {
        returnOwner = Owner.builder().id(1l).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName("smith")).thenReturn(returnOwner);
        Owner smith = service.findByLastName(LAST_NAME);
        assertNotNull(smith);
        assertEquals(smith.getLastName(),LAST_NAME);
        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Owner.builder().id(1l).build());
        returnOwnerSet.add(Owner.builder().id(2l).build());
        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);
        Set<Owner> owners = service.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());

    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = service.findById(1l);
        assertNotNull(owner);
    }

    @Test
    void save() {
        Owner ownertToSave =  Owner.builder().id(1l).build();
        when(ownerRepository.save(any())).thenReturn(ownertToSave);
        Owner savedOwner = service.save(ownertToSave);
        assertNotNull(savedOwner);
        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        service.delete(returnOwner);
//        Default is 1 times
        verify(ownerRepository,times(1)).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(anyLong());
        verify(ownerRepository).deleteById(anyLong());
    }
}
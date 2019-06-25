package com.vinaylogics.springbootpetclinic.services.map;

import com.vinaylogics.springbootpetclinic.models.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {
    OwnerMapService ownerMapService;
    final  Long ownerId = 1l;
    final String ownerName = "Smith";
    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().id(ownerId).lastName(ownerName).build());

    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();
        assertEquals(1, ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));
    }

    @Test
    void save() {
        Owner owner2= Owner.builder().id(2L).build();
        Owner saveOwner = ownerMapService.save(owner2);


    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);
        assertEquals(ownerId,owner.getId());
    }

    @Test
    void saveExistingId(){
        Long id = 2l;
        Owner owner2 =  Owner.builder().id(id).build();
        Owner saveOwner = ownerMapService.save(owner2);
        assertEquals(id, saveOwner.getId());
    }

    @Test
    void saveNoIdTest(){
        Owner saveOwner = ownerMapService.save(Owner.builder().build());
        assertNotNull(saveOwner);
        assertNotNull(saveOwner.getId());
    }

    @Test
    void findByLastName() {
        Owner smith = ownerMapService.findByLastName(ownerName);
        assertNotNull(smith);
        assertEquals(ownerId,smith.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner smith = ownerMapService.findByLastName("foo");
        assertNull(smith);
    }
}
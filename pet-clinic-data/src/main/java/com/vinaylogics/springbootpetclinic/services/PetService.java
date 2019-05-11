package com.vinaylogics.springbootpetclinic.services;

import com.vinaylogics.springbootpetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

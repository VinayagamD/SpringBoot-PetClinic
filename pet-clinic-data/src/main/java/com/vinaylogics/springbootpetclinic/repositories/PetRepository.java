package com.vinaylogics.springbootpetclinic.repositories;

import com.vinaylogics.springbootpetclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

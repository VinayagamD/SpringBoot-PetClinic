package com.vinaylogics.springbootpetclinic.repositories;

import com.vinaylogics.springbootpetclinic.models.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}

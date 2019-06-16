package com.vinaylogics.springbootpetclinic.repositories;


import com.vinaylogics.springbootpetclinic.models.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName);
}

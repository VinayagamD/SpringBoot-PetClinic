package com.vinaylogics.springbootpetclinic.repositories;

import com.vinaylogics.springbootpetclinic.models.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty,Long> {
}

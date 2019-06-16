package com.vinaylogics.springbootpetclinic.repositories;

import com.vinaylogics.springbootpetclinic.models.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}

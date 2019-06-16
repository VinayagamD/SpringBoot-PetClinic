package com.vinaylogics.springbootpetclinic.repositories;

import com.vinaylogics.springbootpetclinic.models.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}

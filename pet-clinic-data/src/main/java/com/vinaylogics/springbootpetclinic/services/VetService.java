package com.vinaylogics.springbootpetclinic.services;

import com.vinaylogics.springbootpetclinic.models.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

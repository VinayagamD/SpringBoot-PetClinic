package com.vinaylogics.springbootpetclinic.services;

import com.vinaylogics.springbootpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

package com.vinaylogics.springbootpetclinic.services.map;

import com.vinaylogics.springbootpetclinic.models.Specialty;
import com.vinaylogics.springbootpetclinic.services.SpecialityService;

import java.util.Set;

public class SpecialtyMapServiceImpl extends AbstractMapService<Specialty,Long> implements SpecialityService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}

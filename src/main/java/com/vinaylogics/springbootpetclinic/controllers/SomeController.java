package com.vinaylogics.springbootpetclinic.controllers;

import com.vinaylogics.springbootpetclinic.services.MyService;

public class SomeController {

    private final MyService myService;

    public SomeController(MyService myService) {
        this.myService = myService;
    }
}

package com.vinaylogics.springbootpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnersController {

    @GetMapping({"","/","/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}

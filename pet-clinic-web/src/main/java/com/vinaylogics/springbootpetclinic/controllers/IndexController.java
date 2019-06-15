package com.vinaylogics.springbootpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "index", "index.html"})
    public String index(){
        return "index";
    }

    @GetMapping({"/oups"})
    public String findOwners(){
        return "notImplemented";
    }
}

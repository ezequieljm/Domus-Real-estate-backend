package com.domusinmobiliaria.domus.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(value = HomeController.BASIS)
public class HomeController
{
    public static final String BASIS = "/";

    @GetMapping
    public String home()
    {
        return "Domus inmobiliaria Backend";
    }

}

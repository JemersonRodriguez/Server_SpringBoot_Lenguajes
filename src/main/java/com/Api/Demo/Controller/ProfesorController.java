package com.Api.Demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProfesorController {
    @GetMapping("/")
    public String listar() {
        return new String();
    }
    

}

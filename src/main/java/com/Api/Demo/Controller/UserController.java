package com.Api.Demo.Controller;

import org.springframework.web.bind.annotation.RestController;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    @GetMapping("/")
    public String getMethodName() {
        return "Hola desde el Server desde SpringBoot";
    }
    
}

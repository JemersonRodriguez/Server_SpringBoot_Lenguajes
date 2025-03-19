package com.Api.Demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.Api.Demo.DTO.UserDTO;

@RestController
public class ProfesorController {
    @GetMapping("/")
    public String listar() {
        return new String();
    }
    

}

package com.Api.Demo.Controller;

import org.springframework.web.bind.annotation.RestController;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import com.Api.Demo.DTO.UserDTO;;


@RestController
public class UserController {
    @GetMapping("/")
    public UserDTO getMethodName() {
        UserDTO user = new UserDTO("Jemerson", "Informatica Empresarial", 26);
        return user;
    }
}

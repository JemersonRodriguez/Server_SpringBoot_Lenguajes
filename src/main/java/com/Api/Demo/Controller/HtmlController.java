package com.Api.Demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HtmlController {
    @GetMapping("/view")
    public String Html_Controller() {
        return "hello";
    }
}

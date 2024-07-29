package com.newlecture.boot3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/index")
    public String asasas(){
        return "index";
    }
}

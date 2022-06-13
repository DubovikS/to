package com.example.test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	@GetMapping("/")
    public String greeting() {
        return "index";
    }
}

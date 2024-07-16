package com.nailton.basespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/oi")

public class OlaController {




        @GetMapping
        public String olaMundo(){
            return "Olá mundo!";

        }
}
    


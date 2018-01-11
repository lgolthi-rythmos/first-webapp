package com.rythmos.firstwebapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/first-app")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("okay!");
    }
}

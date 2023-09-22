package com.example.CICD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/nombre")
    public String obtenerNombre() {
        return "Mi Sebastian Porras";
    }
}

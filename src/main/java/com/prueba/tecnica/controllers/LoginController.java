package com.prueba.tecnica.controllers;

import com.prueba.tecnica.entities.LoginRequest;
import com.prueba.tecnica.services.OperadorService;
import com.prueba.tecnica.services.VendedorService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
@RestController
@RequestMapping("/api/security")
public class LoginController {
    private VendedorService vendedorService;

    public LoginController( VendedorService vendedorService) {
        this.vendedorService = vendedorService;

    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginData) {
        try {

            return ResponseEntity.ok().body(vendedorService.login(loginData.getUsuario(),loginData.getPassword()));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error autenticando el usuario");
        }
    }
}

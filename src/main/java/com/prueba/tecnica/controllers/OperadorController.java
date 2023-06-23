package com.prueba.tecnica.controllers;

import com.prueba.tecnica.entities.Operador;
import com.prueba.tecnica.entities.Recarga;
import com.prueba.tecnica.entities.RecargaRequest;
import com.prueba.tecnica.entities.Vendedor;
import com.prueba.tecnica.services.OperadorService;
import com.prueba.tecnica.services.RecargaService;
import com.prueba.tecnica.services.VendedorService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
@RestController
@RequestMapping("/api/operador")
public class OperadorController {

    private OperadorService operadorService;

    public OperadorController( OperadorService operadorService) {
        this.operadorService = operadorService;

    }

    @GetMapping("/getOperadores")
    public ResponseEntity<?> getOperadores() {
        try {

            return ResponseEntity.ok().body(operadorService.obtenerOperadoderes());

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error guardando la recarga");
        }
    }
}

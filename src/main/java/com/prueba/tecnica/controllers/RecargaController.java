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
@RequestMapping("/api/recargas")
public class RecargaController {
    private RecargaService recargaService;
    private VendedorService vendedorService;
    private OperadorService operadorService;

    public RecargaController(RecargaService recargaService, OperadorService operadorService, VendedorService vendedorService) {
        this.recargaService = recargaService;
        this.operadorService = operadorService;
        this.vendedorService = vendedorService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<?> guardarRecarga(@RequestBody RecargaRequest recarga) {
        try {

            Vendedor vendedor = vendedorService.obtenerVendedorPorId(recarga.getIdVendedor());
            Operador operador = operadorService.obtenerOperadorPorId(recarga.getIdOperador());

            Recarga recargaAuxiliar = new Recarga();

            recargaAuxiliar.setOperador(operador);
            recargaAuxiliar.setVendedor(vendedor);
            recargaAuxiliar.setValorRecarga(recarga.getValorRecarga());
            recargaAuxiliar.setCantidad(recarga.getCantidad());
            recargaAuxiliar.setFechaVenta(recarga.getFechaVenta());
            recargaAuxiliar.setNumeroCelular(recarga.getNumeroCelular());

            recargaService.guardarRecarga(recargaAuxiliar);
            return ResponseEntity.ok().body("Recarga guardada exitosamente");

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error guardando la recarga");
        }
    }
}

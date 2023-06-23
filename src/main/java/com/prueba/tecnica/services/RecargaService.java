package com.prueba.tecnica.services;

import com.prueba.tecnica.entities.Recarga;
import com.prueba.tecnica.interfaces.RecargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecargaService {
    @Autowired
    private RecargaRepository recargaRepository;

    public void guardarRecarga(Recarga recarga) {
        try {

            recargaRepository.save(recarga);
        } catch (Exception e) {

            throw new RuntimeException("Error al guardar la recarga", e);
        }
    }
}

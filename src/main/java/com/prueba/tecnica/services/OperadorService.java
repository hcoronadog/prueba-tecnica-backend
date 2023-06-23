package com.prueba.tecnica.services;

import com.prueba.tecnica.entities.Operador;
import com.prueba.tecnica.interfaces.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperadorService {
    @Autowired
    private OperadorRepository operadorRepository;

    public Operador obtenerOperadorPorId(Integer idOperador) {
        return operadorRepository.findById(idOperador).orElseThrow(()->new RuntimeException("Operador no encontrado"));
    }

    public List<Operador> obtenerOperadoderes () {
        return operadorRepository.findAll();
    }
}

package com.prueba.tecnica.services;

import com.prueba.tecnica.entities.Vendedor;
import com.prueba.tecnica.interfaces.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;

    public Vendedor obtenerVendedorPorId(Integer idVendedor) {
        return vendedorRepository.findById(idVendedor).orElseThrow(()->new RuntimeException("Vendedor no encontrado"));
    }

    public Integer login (String usuario, String password) {

        Integer response = 0;
        try {
            Vendedor usuarioAuxiliar = vendedorRepository.findByCorreoElectronicoAndPassword(usuario, password);

            if (usuarioAuxiliar.getIdVendedor() != null) {

                response = usuarioAuxiliar.getIdVendedor();
            }


        } catch(Exception e) {
            response = 0;
        }
        return response;
    }

}

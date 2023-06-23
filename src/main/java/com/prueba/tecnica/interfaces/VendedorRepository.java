package com.prueba.tecnica.interfaces;
import com.prueba.tecnica.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VendedorRepository extends JpaRepository<Vendedor, Integer>{
    Vendedor findByCorreoElectronicoAndPassword(String correoElectronico, String password);
}

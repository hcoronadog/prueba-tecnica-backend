package com.prueba.tecnica.interfaces;
import com.prueba.tecnica.entities.Operador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperadorRepository extends JpaRepository<Operador, Integer> {
}

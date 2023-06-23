package com.prueba.tecnica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "operadores")
public class Operador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_operador")
    private Integer idOperador;

    @Column(name = "nombre_operador")
    private String nombreOperador;

    @Column(name = "valor_recarga_minuto")
    private Float valorRecargaMinuto;

    public Operador() {
    }

    public Operador(String nombreOperador, Float valorRecargaMinuto) {
        this.nombreOperador = nombreOperador;
        this.valorRecargaMinuto = valorRecargaMinuto;
    }

    // Getters y Setters

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        this.idOperador = idOperador;
    }

    public String getNombreOperador() {
        return nombreOperador;
    }

    public void setNombreOperador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }

    public Float getValorRecargaMinuto() {
        return valorRecargaMinuto;
    }

    public void setValorRecargaMinuto(Float valorRecargaMinuto) {
        this.valorRecargaMinuto = valorRecargaMinuto;
    }
}

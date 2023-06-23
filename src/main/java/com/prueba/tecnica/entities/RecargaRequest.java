package com.prueba.tecnica.entities;


import java.time.LocalDateTime;

public class RecargaRequest {

    private Integer idVendedor;
    private Integer cantidad;
    private Integer idOperador;
    private Float valorRecarga;
    private LocalDateTime fechaVenta;
    private String numeroCelular;

    public RecargaRequest() {
    }

    public RecargaRequest(Integer idVendedor, Integer cantidad, Integer idOperador, Float valorRecarga, LocalDateTime fechaVenta, String numeroCelular) {
        this.idVendedor = idVendedor;
        this.cantidad = cantidad;
        this.idOperador = idOperador;
        this.valorRecarga = valorRecarga;
        this.fechaVenta = fechaVenta;
        this.numeroCelular = numeroCelular;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        this.idOperador = idOperador;
    }

    public Float getValorRecarga() {
        return valorRecarga;
    }

    public void setValorRecarga(Float valorRecarga) {
        this.valorRecarga = valorRecarga;
    }

    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

}


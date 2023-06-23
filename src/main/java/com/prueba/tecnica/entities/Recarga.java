package com.prueba.tecnica.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;


    @Entity
    @Table(name = "recargas")
    public class Recarga {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_recarga")
        private Integer idRecarga;

        @ManyToOne
        @JoinColumn(name = "id_vendedor")
        private Vendedor Vendedor;

        @Column(name = "cantidad")
        private Integer cantidad;

        @ManyToOne
        @JoinColumn(name = "id_operador")
        private Operador operador;

        @Column(name = "valor_recarga")
        private Float valorRecarga;

        @Column(name = "fecha_venta")
        private LocalDateTime fechaVenta;

        @Column(name = "numero_celular")
        private String numeroCelular;

        public Recarga() {
        }



        public Integer getIdRecarga() {
            return idRecarga;
        }

        public void setIdRecarga(Integer idRecarga) {
            this.idRecarga = idRecarga;
        }

        public Vendedor getVendedor() {
            return Vendedor;
        }

        public void setVendedor(Vendedor vendedor) {
            this.Vendedor = vendedor;
        }

        public Integer getCantidad() {
            return cantidad;
        }

        public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
        }

        public Operador getOperador() {
            return operador;
        }

        public void setOperador(Operador operador) {
            this.operador = operador;
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


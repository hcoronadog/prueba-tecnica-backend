package com.prueba.tecnica.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vendedores")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendedor")
    private Integer idVendedor;

    @Column(name = "documento_identidad_vendedor")
    private Integer documentoIdentidadVendedor;

    @Column(name = "nombre_vendedor")
    private String nombreVendedor;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "password")
    private String password;



    public Vendedor() {
    }

    public Vendedor(Integer documentoIdentidadVendedor, String nombreVendedor) {
        this.documentoIdentidadVendedor = documentoIdentidadVendedor;
        this.nombreVendedor = nombreVendedor;

    }

    // Getters y Setters

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Integer getDocumentoIdentidadVendedor() {
        return documentoIdentidadVendedor;
    }

    public void setDocumentoIdentidadVendedor(Integer documentoIdentidadVendedor) {
        this.documentoIdentidadVendedor = documentoIdentidadVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

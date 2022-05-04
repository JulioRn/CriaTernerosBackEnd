package com.backend.CriaTernerosBackEnd.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guachera {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //@Column(nullable = false, name= "ID")
    private int id;

    //@Column(nullable = false, name= "nroTernero")
    private String tipo;

    private String descripcion;

    public Guachera(int id, String tipo, String descripcion) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @Override
    public Guachera clone() {
        return new Guachera(getId(),  getTipo(), getDescripcion());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

package com.backend.CriaTernerosBackEnd.Modelo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_enfermedad;


    private String nombre;


    private String observaciones;


    public int getId_enfermedad() {
        return id_enfermedad;
    }

    public void setId_enfermedad(int id_enfermedad) {
        this.id_enfermedad = id_enfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Enfermedad() {
    }

    public Enfermedad(int id_enfermedad, String nombre, String observaciones) {
        super();
        this.id_enfermedad = id_enfermedad;
        this.nombre = nombre;
        this.observaciones = observaciones;
    }

    @Override
    public Enfermedad clone() {
        return new Enfermedad(getId_enfermedad(), getNombre(), getObservaciones());
    }


}

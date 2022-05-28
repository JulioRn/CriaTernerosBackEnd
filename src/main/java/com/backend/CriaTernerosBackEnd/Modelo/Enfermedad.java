package com.backend.CriaTernerosBackEnd.Modelo;


import java.util.Date;

import javax.persistence.*;

@Entity
public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name= "ID_ENFERMEDAD")
    private int id_enfermedad;

    @Column(nullable = false, name= "NOMBRE")
    private String nombre;

    @Column(nullable = true, name= "OBSERVACIONES")
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

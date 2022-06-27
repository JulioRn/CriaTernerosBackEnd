package com.backend.CriaTernerosBackEnd.Modelo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Madre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMadre;

    private String nroMadre;

    private int trazabilidad;



    public Madre() {
    }


    public Madre(int idMadre, String nroMadre,int trazabilidad) {
        super();
        this.idMadre = idMadre;
        this.nroMadre = nroMadre;
        this.trazabilidad = trazabilidad;
    }

    public int getIdMadre() {
        return idMadre;
    }

    public void setIdMadre(int idMadre) {
        this.idMadre = idMadre;
    }

    public String getNroMadre() {
        return nroMadre;
    }

    public void setNroMadre(String nroMadre) {
        this.nroMadre = nroMadre;
    }

    public int getTrazabilidad() {
        return trazabilidad;
    }

    public void setTrazabilidad(int trazabilidad) {
        this.trazabilidad = trazabilidad;
    }
}

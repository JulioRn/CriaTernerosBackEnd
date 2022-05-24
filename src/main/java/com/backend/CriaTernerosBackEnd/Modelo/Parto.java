package com.backend.CriaTernerosBackEnd.Modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parto{


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    //@Column(nullable = false, name= "ID")
    private int id_parto;

    //@Column(nullable = false, name= "fechaPar")
    private Date fechaPar;

    //nacimiento
    // @Column(nullable = false, name= "tipoPar")
    private String tipoPar;

    //@Column(nullable = false, name= "sexo")
    private String sexo;

    //@Column(nullable = false, name= "trazabilidad")
    private int trazabilidad;

    //@Column(nullable = false, name= "retencionPla")
    private String retencionPla;



    public int getId_parto() {
        return id_parto;
    }


    public void setId_parto(int id_parto) {
        this.id_parto = id_parto;
    }


    public Date getFechaPar() {
        return fechaPar;
    }


    public void setFechaPar(Date fechaPar) {
        this.fechaPar = fechaPar;
    }


    public String getTipoPar() {
        return tipoPar;
    }


    public void setTipoPar(String tipoPar) {
        this.tipoPar = tipoPar;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getTrazabilidad() {
        return trazabilidad;
    }


    public void setTrazabilidad(int trazabilidad) {
        this.trazabilidad = trazabilidad;
    }


    public String getRetencionPla() {
        return retencionPla;
    }


    public void setRetencionPla(String retencionPla) {
        this.retencionPla = retencionPla;
    }

    public Parto() {
    }



    public Parto(int id_parto, Date fechaPar, String tipoPar, String sexo, int trazabilidad, String retencionPla) {
        super();
        this.id_parto = id_parto;
        this.fechaPar = fechaPar;
        this.tipoPar = tipoPar;
        this.sexo = sexo;
        this.trazabilidad = trazabilidad;
        this.retencionPla = retencionPla;
    }


    @Override
    public Parto clone() {
        return new Parto(getId_parto(), getFechaPar(), getTipoPar(), getSexo(), getTrazabilidad(), getRetencionPla());
    }









}

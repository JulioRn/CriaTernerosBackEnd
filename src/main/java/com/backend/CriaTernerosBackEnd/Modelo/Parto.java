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

    //nacimiento
    // @Column(nullable = false, name= "tipoPar")
    private String tipoPar;



    //@Column(nullable = false, name= "trazabilidad")

    //@Column(nullable = false, name= "retencionPla")
    private String retencionPla;



    public int getId_parto() {
        return id_parto;
    }


    public void setId_parto(int id_parto) {
        this.id_parto = id_parto;
    }


    public String getTipoPar() {
        return tipoPar;
    }


    public void setTipoPar(String tipoPar) {
        this.tipoPar = tipoPar;
    }




    public String getRetencionPla() {
        return retencionPla;
    }


    public void setRetencionPla(String retencionPla) {
        this.retencionPla = retencionPla;
    }

    public Parto() {
    }



    public Parto(int id_parto, String tipoPar, String retencionPla) {
        super();
        this.id_parto = id_parto;
        this.tipoPar = tipoPar;
        this.retencionPla = retencionPla;
    }


    @Override
    public Parto clone() {
        return new Parto(getId_parto(), getTipoPar(), getRetencionPla());
    }









}

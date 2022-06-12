package com.backend.CriaTernerosBackEnd.Modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Ternero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(nullable = false, name= "ID_ternero")
    private int id_ternero;

    //@Column(nullable = false, name= "nroTernero")
    private String nroTernero;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date fechaNac;


    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_parto")
    private Parto parto;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_muerte")
    private Muerte muerte;


    //@Column(nullable = false, name= "ENFERMEDAD")
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_enfermedad")
    private Enfermedad enfermedad;

    // @Column(nullable = false, name= "peso")
    private double peso;

    //desleche
    // @Column(nullable = false, name= "fechaDes")
    @JsonFormat(pattern="dd/MM/yyyy")
    private Date fechaDes;
    // @Column(nullable = false, name= "pesoDes")
    private double pesoDes;
    // @Column(nullable = false, name= "altura")
    private double altura;

    private String salud;



    public Ternero() {
    }


    public Ternero(int id_ternero, String nroTernero, Date fechaNac, Parto parto, Enfermedad enfermedad, Muerte muerte, double peso, Date fechaDes, double pesoDes, double altura, String salud) {
        super();
        this.id_ternero = id_ternero;
        this.nroTernero = nroTernero;
        this.fechaNac = fechaNac;
        this.parto = parto;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.fechaDes = fechaDes;
        this.pesoDes = pesoDes;
        this.altura = altura;
        this.salud = salud;
        this.muerte = muerte;
    }


    @Override
    public Ternero clone() {
        return new Ternero(getId(), getNroTernero(), getFechaNac(), getParto(), getEnfermedad(), getMuerte(), getPeso(), getFechaDes(), getPesoDes(), getAltura(), getSalud());
    }


    public int getId() {
        return id_ternero;
    }


    public void setId(int id_ternero) {
        this.id_ternero = id_ternero;
    }

    public String getNroTernero() {
        return nroTernero;
    }


    public void setNroTernero(String nroTernero) {
        this.nroTernero = nroTernero;
    }


    public Date getFechaNac() {
        return fechaNac;
    }


    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }


    public Parto getParto() {
        return parto;
    }


    public void setParto(Parto parto) {
        this.parto = parto;
    }


    public Enfermedad getEnfermedad() {
        return enfermedad;
    }


    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }



    public Date getFechaDes() {
        return fechaDes;
    }


    public void setFechaDes(Date fechaDes) {
        this.fechaDes = fechaDes;
    }


    public double getPesoDes() {
        return pesoDes;
    }


    public void setPesoDes(double pesoDes) {
        this.pesoDes = pesoDes;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public Muerte getMuerte() {
        return muerte;
    }

    public void setMuerte(Muerte muerte) {
        this.muerte = muerte;
    }
}

package com.backend.CriaTernerosBackEnd.Modelo;

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

    //nacimiento
    // @Column(nullable = false, name= "fechNac")
    private Date fechaNac;
    //@Column(nullable = false, name= "parto")
    private String parto;


    //@Column(nullable = false, name= "ENFERMEDAD")
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_enfermedad")
    private Enfermedad enfermedad;

    // @Column(nullable = false, name= "peso")
    private double peso;

    //calostrado
    // @Column(nullable = false, name= "canCal")
    private double cantCal;
    // @Column(nullable = false, name= "tiempo")
    private int tiempo;

    //refractometria
    // @Column(nullable = false, name= "fechaRef")
    private Date fechaRef;
    //  @Column(nullable = false, name= "valor")
    private double valor;

    //desleche
    // @Column(nullable = false, name= "fechaDes")
    private Date fechaDes;
    // @Column(nullable = false, name= "pesoDes")
    private double pesoDes;
    // @Column(nullable = false, name= "altura")
    private double altura;


    public Ternero() {
    }


    public Ternero(int id_ternero, String nroTernero, Date fechaNac, String parto, Enfermedad enfermedad, double peso, double cantCal, int tiempo, Date fechaRef,
                   double valor, Date fechaDes, double pesoDes, double altura) {
        super();
        this.id_ternero = id_ternero;
        this.nroTernero = nroTernero;
        this.fechaNac = fechaNac;
        this.parto = parto;
        this.peso = peso;
        this.enfermedad = enfermedad;
        this.cantCal = cantCal;
        this.tiempo = tiempo;
        this.fechaRef = fechaRef;
        this.valor = valor;
        this.fechaDes = fechaDes;
        this.pesoDes = pesoDes;
        this.altura = altura;
    }


    @Override
    public Ternero clone() {
        return new Ternero(getId(), getNroTernero(), getFechaNac(), getParto(), getEnfermedad(), getPeso(), getCantCal(), getTiempo(), getFechaRef(), getValor(), getFechaDes(), getPesoDes(), getAltura());
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


    public String getParto() {
        return parto;
    }


    public void setParto(String parto) {
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


    public double getCantCal() {
        return cantCal;
    }


    public void setCantCal(double cantCal) {
        this.cantCal = cantCal;
    }


    public int getTiempo() {
        return tiempo;
    }


    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }


    public Date getFechaRef() {
        return fechaRef;
    }


    public void setFechaRef(Date fechaRef) {
        this.fechaRef = fechaRef;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
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


}

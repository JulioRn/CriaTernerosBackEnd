package com.backend.CriaTernerosBackEnd.Modelo;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //@Column(nullable = false, name= "ID")
    private int id;
    //@Column(nullable = false, name= "NOMBRE")
    private String nombre;
    //@Column(nullable = false, name= "APELLIDO")
    private String apellido;
    //@Column(nullable = false, name= "MAIL")
    private String mail;
    //@Column(nullable = false, name= "CEDULA")
    private int cedula;
    //@Column(nullable = false, name= "TELEFONO")
    private int telefono;
    //@Column(nullable = false, name= "ACCESO")
    private String acceso;
    //@Column(nullable = false, name= "CONTRASENA")
    private String contra;


    public Usuario() {
    }


    public Usuario(int id, String nombre, String apellido, String mail, int cedula,int telefono, String nomAcc, String contra) {
        super();
        this.id = id;
        this.nombre= nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.acceso = acceso;
        this.contra = contra;
    }



    @Override
    public Usuario clone() {
        return new Usuario(getId(), getNombre(), getApellido(), getMail(), getCedula(), getTelefono(), getAcceso(), getContra());
    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getMail() {
        return mail;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }


    public int getCedula() {
        return cedula;
    }


    public void setCedula(int cedula) {
        this.cedula = cedula;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public String getAcceso() {
        return acceso;
    }


    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }


    public String getContra() {
        return contra;
    }


    public void setContra(String contra) {
        this.contra = contra;
    }
}

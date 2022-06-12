package com.backend.CriaTernerosBackEnd.Modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Refractrometria {


	  @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)

	  //@Column(nullable = false, name= "id_refractometria")
	    private int id_refractometria;

		@JsonFormat(pattern="dd/MM/yyyy")
	    private Date fecha;

		private double nota;

		private int edad;

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "id_ternero")
		private Ternero ternero;

	public Refractrometria(){

	}

	public Refractrometria(int id_refractometria, Date fecha, double nota, int edad, Ternero ternero) {
		super();
		this.id_refractometria = id_refractometria;
		this.fecha = fecha;
		this.nota = nota;
		this.edad = edad;
		this.ternero = ternero;
	}

	public int getId_refractometria() {
		return id_refractometria;
	}

	public void setId_refractometria(int id_refractometria) {
		this.id_refractometria = id_refractometria;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Ternero getTernero() {
		return ternero;
	}

	public void setTernero(Ternero ternero) {
		this.ternero = ternero;
	}
}
package com.backend.CriaTernerosBackEnd.Modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Calostrado {


	  @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)

	  //@Column(nullable = false, name= "id_refractometria")
	    private int id_calostrado;

	    //@Column(nullable = false, name= "tipoGuachera")
	    private Date fecha;

		private double nota;

		private int edad;

	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "id_ternero")
		private Ternero ternero;

	public Calostrado(){

	}

	public Calostrado(int id_calostrado, Date fecha, double nota, int edad, Ternero ternero) {
		super();
		this.id_calostrado = id_calostrado;
		this.fecha = fecha;
		this.nota = nota;
		this.edad = edad;
		this.ternero = ternero;
	}

	public int getId_calostrado() {
		return id_calostrado;
	}

	public void setId_calostrado(int id_calostrado) {
		this.id_calostrado = id_calostrado;
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
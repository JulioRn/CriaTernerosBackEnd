package com.backend.CriaTernerosBackEnd.Modelo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Muerte {


	  @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)

	  //@Column(nullable = false, name= "id_refractometria")
	    private int id_calostrado;

	    //@Column(nullable = false, name= "tipoGuachera")
	    private Date fecha;

		private String causa;

		private int dias;

	@OneToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "id_ternero")
		private Ternero ternero;

	public Muerte(){

	}

	public Muerte(int id_calostrado, Date fecha, String causa, int dias, Ternero ternero) {
		super();
		this.id_calostrado = id_calostrado;
		this.fecha = fecha;
		this.causa = causa;
		this.dias = dias;
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

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public Ternero getTernero() {
		return ternero;
	}

	public void setTernero(Ternero ternero) {
		this.ternero = ternero;
	}
}
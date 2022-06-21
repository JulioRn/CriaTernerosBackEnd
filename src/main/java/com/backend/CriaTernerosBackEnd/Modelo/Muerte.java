package com.backend.CriaTernerosBackEnd.Modelo;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Muerte {


	  @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)

	    private int id_muerte;

		@JsonFormat(pattern="dd/MM/yyyy")
	    private Date fecha;

		private String causa;

		private int dias;

	private String comentario;

	public Muerte(){

	}

	public Muerte(int id_muerte, Date fecha, String causa, int dias, String comentario) {
		super();
		this.id_muerte = id_muerte;
		this.fecha = fecha;
		this.causa = causa;
		this.dias = dias;
		this.comentario = comentario;
	}

	public int getId_muerte() {
		return id_muerte;
	}

	public void setId_muerte(int id_muerte) {
		this.id_muerte = id_muerte;
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

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
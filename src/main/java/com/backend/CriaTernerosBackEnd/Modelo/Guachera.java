package com.backend.CriaTernerosBackEnd.Modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guachera {
	
	
	  @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	   
	  //@Column(nullable = false, name= "ID_guaguera")
	    private int id_guachera;

	    //@Column(nullable = false, name= "tipoGuachera")
	    private String tipoGuachera;

	public Guachera() {
	}



	public Guachera(int id_guachera, String tipoGuachera) {
			super();
			this.id_guachera = id_guachera;
			this.tipoGuachera = tipoGuachera;
		}

	  
		 @Override
		    public Guachera clone() {
		        return new Guachera(getId_guachera(), getTipoGuachera());
		    }

	public int getId_guachera() {
		return id_guachera;
	}

	public void setId_guachera(int id_guachera) {
		this.id_guachera = id_guachera;
	}

	public String getTipoGuachera() {
		return tipoGuachera;
	}

	public void setTipoGuachera(String tipoGuachera) {
		this.tipoGuachera = tipoGuachera;
	}
	    
	    
}
package com.backend.CriaTernerosBackEnd.Modelo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimento  {
	
	
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
  
	//@Column(nullable = false, name= "ID_alimento")
    private int id_alimento;

   // @Column(nullable = false, name= "nombre")
    private String nombre;

 
    //@Column(nullable = false, name= "stock")
    private int stock;





	public int getId_alimento() {
		return id_alimento;
	}


	public void setId(int id_alimento) {
		this.id_alimento = id_alimento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	  public Alimento() {
	    }

	public Alimento(int id_alimento, String nombre, int stock) {
		super();
		this.id_alimento = id_alimento;
		this.nombre = nombre;
		this.stock = stock;
	}
    
	 @Override
	    public Alimento clone() {
	        return new Alimento(getId_alimento(), getNombre(), getStock());
	    }
}

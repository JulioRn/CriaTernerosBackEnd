package com.backend.CriaTernerosBackEnd.Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicamento {
	
	
	  @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	   
	  //@Column(nullable = false, name= "ID_medicamento")
	    private int id_medicamento;

	    //@Column(nullable = false, name= "nombreMed")
	    private String nombreMed;
	    
	    //@Column(nullable = false, name= "stockMed")
	    private int stockMed;
	    

		public Medicamento(int id_medicamento, String nombreMed, int stockMed) {
			super();
			this.id_medicamento = id_medicamento;
			this.nombreMed = nombreMed;
			this.stockMed = stockMed;
		}

		public int getId_medicamento() {
			return id_medicamento;
		}

		public void setId_medicamento(int id_medicamento) {
			this.id_medicamento = id_medicamento;
		}

		public String getNombreMed() {
			return nombreMed;
		}

		public void setNombreMed(String nombreMed) {
			this.nombreMed = nombreMed;
		}

		public int getStockMed() {
			return stockMed;
		}

		public void setStockMed(int stockMed) {
			this.stockMed = stockMed;
		}

		public Medicamento() {
			
		}
		 @Override
		    public Medicamento clone() {
		        return new Medicamento(getId_medicamento(), getNombreMed(),getStockMed());
		    }

}

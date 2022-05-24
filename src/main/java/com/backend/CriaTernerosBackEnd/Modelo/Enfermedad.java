package com.backend.CriaTernerosBackEnd.Modelo;


import java.util.Date;

import javax.persistence.*;

@Entity
public class Enfermedad {
	
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    //@Column(nullable = false, name= "ID_enfermedad")
	    private int id_enfermedad;
	    //@Column(nullable = false, name= "NOMBRE")
	    private String nombre;
	    //@Column(nullable = false, name= "fechaIn")
	    private Date  fechaIn;
	    //@Column(nullable = false, name= "temRec")
	    private double temRec;
	    //@Column(nullable = false, name= "deshidratacion")
	    private String deshidratacion;
	    //@Column(nullable = false, name= "descNasal")
	    private String descNasal;
	    //@Column(nullable = false, name= "descNasal")
	    private String descOcular;
	  //@Column(nullable = false, name= "tos")
	    private String tos;

	//@Column(nullable = false, name= "diarrea")
	private String diarrea;

	    //@Column(nullable = false, name= "frecResp")
	    private String frecResp;
	  //@Column(nullable = false, name= "otros")
	    private String otros;
	  //@Column(nullable = false, name= "tratamiento")
	    private String tratamiento;
	    //@Column(nullable = false, name= "fechaFin")
	    private Date  fechaFin;
	    //@Column(nullable = false, name= "fechaMuerte")
	    private Date  fechaMuerte;
	    //@Column(nullable = false, name= "observaciones")
	    private String observaciones;
	    //@Column(nullable = false, name= "medicamento")
	    private int medicamento;
		public int getId_enfermedad() {
			return id_enfermedad;
		}
		public void setId_enfermedad(int id_enfermedad) {
			this.id_enfermedad = id_enfermedad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Date getFechaIn() {
			return fechaIn;
		}
		public void setFechaIn(Date fechaIn) {
			this.fechaIn = fechaIn;
		}
		public double getTemRec() {
			return temRec;
		}
		public void setTemRec(double temRec) {
			this.temRec = temRec;
		}
		public String getDeshidratacion() {
			return deshidratacion;
		}
		public void setDeshidratacion(String deshidratacion) {
			this.deshidratacion = deshidratacion;
		}
		public String getDescNasal() {
			return descNasal;
		}
		public void setDescNasal(String descNasal) {
			this.descNasal = descNasal;
		}
		public String getDescOcular() {
			return descOcular;
		}
		public void setDescOcular(String descOcular) {
			this.descOcular = descOcular;
		}
		public String getTos() {
			return tos;
		}
		public void setTos(String tos) {
			this.tos = tos;
		}
		public String getFrecResp() {
			return frecResp;
		}
		public void setFrecResp(String frecResp) {
			this.frecResp = frecResp;
		}
		public String getOtros() {
			return otros;
		}
		public void setOtros(String otros) {
			this.otros = otros;
		}
		public String getTratamiento() {
			return tratamiento;
		}
		public void setTratamiento(String tratamiento) {
			this.tratamiento = tratamiento;
		}
		public Date getFechaFin() {
			return fechaFin;
		}
		public void setFechaFin(Date fechaFin) {
			this.fechaFin = fechaFin;
		}
		public Date getFechaMuerte() {
			return fechaMuerte;
		}
		public void setFechaMuerte(Date fechaMuerte) {
			this.fechaMuerte = fechaMuerte;
		}
		public String getObservaciones() {
			return observaciones;
		}
		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}
		public int getMedicamento() {
			return medicamento;
		}
		public void setMedicamento(int medicamento) {
			this.medicamento = medicamento;
		}

	public String getDiarrea() {
		return diarrea;
	}

	public void setDiarrea(String diarrea) {
		this.diarrea = diarrea;
	}

	public Enfermedad() {
	}

	public Enfermedad(int id_enfermedad, String nombre, Date fechaIn, double temRec, String deshidratacion,
				String descNasal, String descOcular, String tos, String frecResp, String otros, String tratamiento,
				Date fechaFin, Date fechaMuerte, String observaciones, int medicamento, String diarrea) {
			super();
			this.id_enfermedad = id_enfermedad;
			this.nombre = nombre;
			this.fechaIn = fechaIn;
			this.temRec = temRec;
			this.deshidratacion = deshidratacion;
			this.descNasal = descNasal;
			this.descOcular = descOcular;
			this.tos = tos;
			this.frecResp = frecResp;
			this.otros = otros;
			this.tratamiento = tratamiento;
			this.fechaFin = fechaFin;
			this.fechaMuerte = fechaMuerte;
			this.observaciones = observaciones;
			this.medicamento = medicamento;
			this.diarrea = diarrea;
		}
	    
		 @Override
		    public Enfermedad clone() {
		        return new Enfermedad(getId_enfermedad(), getNombre(),getFechaIn(),getTemRec(),getDeshidratacion(),getDescNasal(),getDescOcular(),getTos(),getFrecResp(),getOtros(),getTratamiento(),getFechaFin(),getFechaMuerte(),getObservaciones(),getMedicamento(), getDiarrea());
		    }
	    
	    
}

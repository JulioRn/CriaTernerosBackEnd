package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import com.backend.CriaTernerosBackEnd.Modelo.Medicamento;

public interface MedicamentoServicio {
	
	public Medicamento saveMedicamento(Medicamento medicamento);
	public List<Medicamento> getAllMedicamentos();

	    public void removeMedicamento(int id_medicamento);

}

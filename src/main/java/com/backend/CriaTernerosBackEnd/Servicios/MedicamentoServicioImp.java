package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Medicamento;
import com.backend.CriaTernerosBackEnd.Repositorio.MedicamentoRepositorio;

@Service
public class MedicamentoServicioImp implements MedicamentoServicio{
	 @Autowired
	    private MedicamentoRepositorio medicamentoRepositorio;

	    public Medicamento saveMedicamento(Medicamento medicamento) {
	        return medicamentoRepositorio.save(medicamento);
	    }

	  
	    public List<Medicamento> getAllMedicamentos() {
	        return medicamentoRepositorio.findAll();
	    }

	    public void removeMedicamento(int id_medicamento) {
	         medicamentoRepositorio.deleteById(id_medicamento);
	    }
	
	
	
}

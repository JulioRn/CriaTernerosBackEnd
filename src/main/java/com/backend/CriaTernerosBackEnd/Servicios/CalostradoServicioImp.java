package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Calostrado;
import com.backend.CriaTernerosBackEnd.Repositorio.CalostradoRepositorio;


@Service
public class CalostradoServicioImp implements CalostradoServicio{
	
	  @Autowired
	    private CalostradoRepositorio calostradoRepositorio;

	    public Calostrado saveCalostrado(Calostrado calostrado) {
	        return calostradoRepositorio.save(calostrado);
	    }

	  
	    public List<Calostrado> getAllCalostrados() {
	        return calostradoRepositorio.findAll();
	    }

	    public void removeCalostrado(int id_calostrado) {
	         calostradoRepositorio.deleteById(id_calostrado);
	    }

}
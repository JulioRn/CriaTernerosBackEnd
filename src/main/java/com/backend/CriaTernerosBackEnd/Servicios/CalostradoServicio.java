package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Calostrado;

@Service
public interface CalostradoServicio {
	public Calostrado saveCalostrado(Calostrado calostrado);
	public List<Calostrado> getAllCalostrados();

	    public void removeCalostrado(int id_calostrado);
	
}

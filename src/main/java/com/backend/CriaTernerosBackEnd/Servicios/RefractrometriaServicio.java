package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Refractrometria;

@Service
public interface RefractrometriaServicio {
	public Refractrometria saveRefractrometria(Refractrometria refractrometria);
	public List<Refractrometria> getAllRefractrometrias();

	    public void removeRefractrometria(int id_refractrometria);
	
}
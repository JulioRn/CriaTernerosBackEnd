package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;
import java.util.Optional;

import com.backend.CriaTernerosBackEnd.Modelo.Usuario;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Refractrometria;

@Service
public interface RefractrometriaServicio {
	public Refractrometria saveRefractrometria(Refractrometria refractrometria);
	public List<Refractrometria> getAllRefractrometrias();

	public Optional<Refractrometria> findById(int id_refractrometria);

	    public void removeRefractrometria(int id_refractrometria);

	public Refractrometria findByTernId(int ternId);
	
}
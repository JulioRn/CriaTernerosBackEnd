package com.backend.CriaTernerosBackEnd.Servicios;
import java.util.List;
import java.util.Optional;

import com.backend.CriaTernerosBackEnd.Modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Refractrometria;
import com.backend.CriaTernerosBackEnd.Repositorio.RefractrometriaRepositorio;


@Service
public class RefractrometriaServicioImp implements RefractrometriaServicio{
	
	  @Autowired
	    private RefractrometriaRepositorio refractrometriaRepositorio;

	    public Refractrometria saveRefractrometria(Refractrometria refractrometria) {
	        return refractrometriaRepositorio.save(refractrometria);
	    }

	  
	    public List<Refractrometria> getAllRefractrometrias() {
	        return refractrometriaRepositorio.findAll();
	    }

	public Optional<Refractrometria> findById(int id_refractrometria){
		return refractrometriaRepositorio.findById(id_refractrometria);
	}

	    public void removeRefractrometria(int id_refractrometria) {
	         refractrometriaRepositorio.deleteById(id_refractrometria);
	    }

	public Refractrometria findByTernId(int ternId) {
		return refractrometriaRepositorio.findByTernId(ternId);
	}

}
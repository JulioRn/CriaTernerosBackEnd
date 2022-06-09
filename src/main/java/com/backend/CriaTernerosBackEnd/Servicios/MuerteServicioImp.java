package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Muerte;
import com.backend.CriaTernerosBackEnd.Modelo.Ternero;
import com.backend.CriaTernerosBackEnd.Repositorio.MuerteRepositorio;


@Service
public class MuerteServicioImp implements MuerteServicio{
	
	  @Autowired
	    private MuerteRepositorio muerteRepositorio;

	    public Muerte saveMuerte(Muerte muerte) {
	        return muerteRepositorio.save(muerte);
	    }

	  
	    public List<Muerte> getAllMuertes() {
	        return muerteRepositorio.findAll();
	    }

	    public void removeMuerte(int id_muerte) {
	         muerteRepositorio.deleteById(id_muerte);
	    }
	    public List<Muerte> entreFechasMuerte(Date from, Date to){
	    	return muerteRepositorio.findByStartDateBetween(from, to);
	    }

}
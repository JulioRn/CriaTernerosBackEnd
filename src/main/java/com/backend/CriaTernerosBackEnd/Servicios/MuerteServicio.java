package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Muerte;
import com.backend.CriaTernerosBackEnd.Modelo.Ternero;

@Service
public interface MuerteServicio {
	public Muerte saveMuerte(Muerte muerte);
	public List<Muerte> getAllMuertes();
	public List<Muerte> entreFechasMuerte(Date from, Date to);
	    public void removeMuerte(int id_muerte);
	
}
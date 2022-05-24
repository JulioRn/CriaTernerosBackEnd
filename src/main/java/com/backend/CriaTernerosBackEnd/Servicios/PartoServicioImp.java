package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Parto;
import com.backend.CriaTernerosBackEnd.Repositorio.PartoRepositorio;


@Service
public class PartoServicioImp implements PartoServicio {

    @Autowired
    private PartoRepositorio partoRepositorio;

    public Parto saveParto(Parto parto) {
        return partoRepositorio.save(parto);
    }


    public List<Parto> getAllPartos() {
        return partoRepositorio.findAll();
    }

    public void removeParto(int id_parto) {
        partoRepositorio.deleteById(id_parto);
    }

}

package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Guachera;
import com.backend.CriaTernerosBackEnd.Repositorio.GuacheraRepositorio;


@Service
public class GuacheraServicioImp implements GuacheraServicio {
    @Autowired
    private GuacheraRepositorio guacheraRepositorio;

    public Guachera saveGuachera(Guachera guachera) {
        return guacheraRepositorio.save(guachera);
    }


    public List<Guachera> getAllGuacheras() {
        return guacheraRepositorio.findAll();
    }

    public void removeGuachera(int id_guachera) {
        guacheraRepositorio.deleteById(id_guachera);
    }






}

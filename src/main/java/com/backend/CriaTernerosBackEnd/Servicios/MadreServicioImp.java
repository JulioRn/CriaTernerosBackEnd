package com.backend.CriaTernerosBackEnd.Servicios;

import com.backend.CriaTernerosBackEnd.Modelo.Madre;
import com.backend.CriaTernerosBackEnd.Modelo.Ternero;
import com.backend.CriaTernerosBackEnd.Repositorio.MadreRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MadreServicioImp implements MadreServicio{
    @Autowired
    private MadreRepositorio madreRepositorio;

    public Madre saveMadre(Madre madre) {
        return madreRepositorio.save(madre);
    }


    public List<Madre> getAllMadres() {
        return madreRepositorio.findAll();
    }

    public Optional<Madre> findById(int id_madre){
        return madreRepositorio.findById(id_madre);
    }

    public void removeMadre(int id_madre) {
        madreRepositorio.deleteById(id_madre);
    }



}

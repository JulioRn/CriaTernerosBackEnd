package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Ternero;
import com.backend.CriaTernerosBackEnd.Repositorio.TerneroRepositorio;

@Service
public class TerneroServicioImp implements TerneroServicio{
    @Autowired
    private TerneroRepositorio terneroRepositorio;

    public Ternero saveTernero(Ternero ternero) {
        return terneroRepositorio.save(ternero);
    }


    public List<Ternero> getAllTerneros() {
        return terneroRepositorio.findAll();
    }

    public Optional<Ternero> findById(int id_ternero){
        return terneroRepositorio.findById(id_ternero);
    }

    public List<Ternero> entreFechasTerneros(Date dateI, Date dateF) {
        return terneroRepositorio.findByStartDateBetween(dateI, dateF);
    }

    public List<Ternero> madresTern(int idMadre){
        return terneroRepositorio.madresTern(idMadre);
    }


    public void removeTernero(int id_ternero) {
        terneroRepositorio.deleteById(id_ternero);
    }

    public List<Ternero> ultimoMesTerneros(){
        return terneroRepositorio.FindByTerneroActivoDate();
    }



}

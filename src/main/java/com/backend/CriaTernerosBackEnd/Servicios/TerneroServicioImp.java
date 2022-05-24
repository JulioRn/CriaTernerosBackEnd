package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

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

    public void removeTernero(int id_ternero) {
        terneroRepositorio.deleteById(id_ternero);
    }



}
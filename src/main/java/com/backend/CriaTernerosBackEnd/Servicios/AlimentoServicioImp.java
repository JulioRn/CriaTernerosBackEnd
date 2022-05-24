package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.CriaTernerosBackEnd.Modelo.Alimento;
import com.backend.CriaTernerosBackEnd.Repositorio.AlimentoRepositorio;


@Service
public class AlimentoServicioImp implements AlimentoServicio {
    @Autowired
    private AlimentoRepositorio alimentoRepositorio;

    public Alimento saveAlimento(Alimento alimento) {
        return alimentoRepositorio.save(alimento);
    }


    public List<Alimento> getAllAlimentos() {
        return alimentoRepositorio.findAll();
    }

    public void removeAlimento(int id_alimento) {
        alimentoRepositorio.deleteById(id_alimento);
    }





}

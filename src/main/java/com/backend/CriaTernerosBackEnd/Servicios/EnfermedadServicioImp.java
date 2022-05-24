package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend.CriaTernerosBackEnd.Modelo.Enfermedad;
import com.backend.CriaTernerosBackEnd.Repositorio.EnfermedadRepositorio;
import org.springframework.stereotype.Service;

@Service
public class EnfermedadServicioImp implements EnfermedadServicio {
    @Autowired
    private EnfermedadRepositorio enfermedadRepositorio;

    public Enfermedad saveEnfermedad(Enfermedad enfermedad) {
        return enfermedadRepositorio.save(enfermedad);
    }


    public List<Enfermedad> getAllEnfermedads() {
        return enfermedadRepositorio.findAll();
    }

    public void removeEnfermedad(int id_enfermedad) {
        enfermedadRepositorio.deleteById(id_enfermedad);
    }


}

package com.backend.CriaTernerosBackEnd.Servicios;

import com.backend.CriaTernerosBackEnd.Modelo.Madre;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface MadreServicio {

    public Madre saveMadre(Madre madre);
    public List<Madre> getAllMadres();

    public Optional<Madre> findById(int id_madre);

    public void removeMadre(int id_madre);




}

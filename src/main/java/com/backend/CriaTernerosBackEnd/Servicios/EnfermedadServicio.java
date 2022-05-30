package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import com.backend.CriaTernerosBackEnd.Modelo.Enfermedad;


public interface EnfermedadServicio {
    public Enfermedad saveEnfermedad(Enfermedad enfermedad);
    public List<Enfermedad> getAllEnfermedad();

    public void removeEnfermedad(int id_enfermedad);

    public Enfermedad getEnfermedad(int id_enfermedad);

}

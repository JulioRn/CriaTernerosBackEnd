package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.List;

import com.backend.CriaTernerosBackEnd.Modelo.Enfermedad;


public interface EnfermedadServicio {
    public Enfermedad saveEnfermedad(Enfermedad enfermedad);
    public List<Enfermedad> getAllEnfermedads();

    public void removeEnfermedad(int id_enfermedad);

}

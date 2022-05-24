package com.backend.CriaTernerosBackEnd.Servicios;
import com.backend.CriaTernerosBackEnd.Modelo.Alimento;


import java.util.List;


public interface AlimentoServicio {
    public Alimento saveAlimento(Alimento alimento);
    public List<Alimento> getAllAlimentos();

    public void removeAlimento(int id_alimento);
}

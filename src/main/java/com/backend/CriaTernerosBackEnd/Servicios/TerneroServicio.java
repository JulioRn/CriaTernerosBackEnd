package com.backend.CriaTernerosBackEnd.Servicios;

import java.util.Date;
import java.util.List;

import com.backend.CriaTernerosBackEnd.Modelo.Ternero;

public interface TerneroServicio {

    public Ternero saveTernero(Ternero ternero);
    public List<Ternero> getAllTerneros();

    public void removeTernero(int id_ternero);

public List<Ternero> entreFechasTerneros(Date dateI, Date dateF);
    public List<Ternero> ultimoMesTerneros();



}

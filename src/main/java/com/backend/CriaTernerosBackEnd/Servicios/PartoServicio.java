package com.backend.CriaTernerosBackEnd.Servicios;

import com.backend.CriaTernerosBackEnd.Modelo.Parto;


import java.util.List;



public interface PartoServicio {
    public Parto saveParto(Parto parto);
    public List<Parto> getAllPartos();

    public void removeParto(int id_parto);

}

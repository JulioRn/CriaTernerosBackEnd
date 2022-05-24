package com.backend.CriaTernerosBackEnd.Servicios;
import com.backend.CriaTernerosBackEnd.Modelo.Guachera;


import java.util.List;


public interface GuacheraServicio {
    public Guachera saveGuachera(Guachera guachera);
    public List<Guachera> getAllGuacheras();

    public void removeGuachera(int id_guacheara);

}

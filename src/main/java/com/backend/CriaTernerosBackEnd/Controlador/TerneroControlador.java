package com.backend.CriaTernerosBackEnd.Controlador;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.CriaTernerosBackEnd.Modelo.Ternero;
import com.backend.CriaTernerosBackEnd.Servicios.TerneroServicio;

@RestController
@RequestMapping("/ternero")
@CrossOrigin

public class TerneroControlador {

    @Autowired
    private TerneroServicio terneroServicio;

    @PostMapping("/agregar")
    public String add(@RequestBody Ternero ternero){
        terneroServicio.saveTernero(ternero);
        return "Nuevo Ternero agregado";
    }

    @GetMapping("/getAll")
    public List<Ternero> list(){
        return terneroServicio.getAllTerneros();
    }


    @GetMapping("/eliminar/{id_ternero}")
    public String remove(@PathVariable int id_ternero){
        terneroServicio.removeTernero(id_ternero);
        return "Ternero Eliminado";
    }
    @GetMapping("/entreFechasTerneros/{from}/{to}")
    public List<Ternero> getTernerosBetween(@PathVariable Date from, @PathVariable Date to){
        List<Ternero> ter= terneroServicio.entreFechasTerneros(from, to );

        return ter;
    }

    @GetMapping("/currentMesTerneros")
    public List<Ternero> list2(){
        return terneroServicio.ultimoMesTerneros();
    }


}

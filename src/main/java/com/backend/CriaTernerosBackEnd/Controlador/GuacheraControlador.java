package com.backend.CriaTernerosBackEnd.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.CriaTernerosBackEnd.Modelo.Guachera;
import com.backend.CriaTernerosBackEnd.Servicios.GuacheraServicio;

@RestController
@RequestMapping("/guachera")
@CrossOrigin

public class GuacheraControlador {

    @Autowired
    public GuacheraServicio guacheraServicio;

    @PostMapping("/agregar")
    public String add(@RequestBody Guachera guachera){
        guacheraServicio.saveGuachera(guachera);
        return "Nuevo Guachera agregado";
    }

    @GetMapping("/getAll")
    public List<Guachera> list(){
        return guacheraServicio.getAllGuacheras();
    }


    @GetMapping("/eliminar/{id_guachera}")
    public String remove(@PathVariable int id_guachera){
        guacheraServicio.removeGuachera(id_guachera);
        return "Guachera Eliminado";
    }

}

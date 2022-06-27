package com.backend.CriaTernerosBackEnd.Controlador;

import com.backend.CriaTernerosBackEnd.Modelo.Madre;
import com.backend.CriaTernerosBackEnd.Servicios.MadreServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/madre")
@CrossOrigin

public class MadreControlador {

    @Autowired
    private MadreServicio madreServicio;

    @PostMapping("/agregar")
    public String add(@RequestBody Madre madre){
        madreServicio.saveMadre(madre);
        return "Nueva Madre agregada";
    }

    @GetMapping("/getAll")
    public List<Madre> list(){
        return madreServicio.getAllMadres();
    }

    @GetMapping("/getById/{id_madre}")
    public Optional<Madre> list(@PathVariable int id_madre){
        return madreServicio.findById(id_madre);
    }


    @GetMapping("/eliminar/{id_madre}")
    public String remove(@PathVariable int id_madre){
        madreServicio.removeMadre(id_madre);
        return "Madre Eliminadoa";
    }

}

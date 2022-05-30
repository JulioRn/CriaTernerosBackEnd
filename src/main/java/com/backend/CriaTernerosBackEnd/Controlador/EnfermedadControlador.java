package com.backend.CriaTernerosBackEnd.Controlador;

import java.util.List;

import com.backend.CriaTernerosBackEnd.Repositorio.EnfermedadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.backend.CriaTernerosBackEnd.Modelo.Enfermedad;
import com.backend.CriaTernerosBackEnd.Servicios.EnfermedadServicio;

@RestController
@RequestMapping("/enfermedad")
@CrossOrigin

public class EnfermedadControlador {

    @Autowired
    public EnfermedadServicio enfermedadServicio;
    @Autowired
    public EnfermedadRepositorio enfermedadRepositorio;

    @PostMapping("/agregar")
    public String add(@RequestBody Enfermedad enfermedad){
        enfermedadServicio.saveEnfermedad(enfermedad);
        return "Nuevo Enfermedad agregado";
    }

    @GetMapping("/getAll")
    public List<Enfermedad> list(){
        return enfermedadServicio.getAllEnfermedad();
    }

    @RequestMapping("/get/{id_enfermedad}")
    public Enfermedad enfe(@PathVariable int id_enfermedad){
        Enfermedad en= enfermedadServicio.getEnfermedad(id_enfermedad);
        return en;
    }


    @GetMapping("/eliminar/{id_enfermedad}")
    public String remove(@PathVariable int id_enfermedad){
        enfermedadServicio.removeEnfermedad(id_enfermedad);
        return "Enfermedad Eliminado";
    }

}

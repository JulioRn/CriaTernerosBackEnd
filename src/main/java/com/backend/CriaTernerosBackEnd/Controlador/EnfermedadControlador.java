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

import com.backend.CriaTernerosBackEnd.Modelo.Enfermedad;
import com.backend.CriaTernerosBackEnd.Servicios.EnfermedadServicio;

@RestController
@RequestMapping("/enfermedad")
@CrossOrigin

public class EnfermedadControlador {

    @Autowired
    public EnfermedadServicio enfermedadServicio;

    @PostMapping("/agregar")
    public String add(@RequestBody Enfermedad enfermedad){
        enfermedadServicio.saveEnfermedad(enfermedad);
        return "Nuevo Enfermedad agregado";
    }

    @GetMapping("/getAll")
    public List<Enfermedad> list(){
        return enfermedadServicio.getAllEnfermedads();
    }


    @GetMapping("/eliminar/{id_enfermedad}")
    public String remove(@PathVariable int id_enfermedad){
        enfermedadServicio.removeEnfermedad(id_enfermedad);
        return "Enfermedad Eliminado";
    }

}

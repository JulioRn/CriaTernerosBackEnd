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

import com.backend.CriaTernerosBackEnd.Modelo.Parto;
import com.backend.CriaTernerosBackEnd.Servicios.PartoServicio;

@RestController
@RequestMapping("/parto")
@CrossOrigin

public class PartoControlador {

    @Autowired
    public PartoServicio partoServicio;

    @PostMapping("/agregar")
    public String add(@RequestBody Parto parto){
        partoServicio.saveParto(parto);
        return "Nuevo Parto agregado";
    }

    @GetMapping("/getAll")
    public List<Parto> list(){
        return partoServicio.getAllPartos();
    }


    @GetMapping("/eliminar/{id_parto}")
    public String remove(@PathVariable int id_parto){
        partoServicio.removeParto(id_parto);
        return "Parto Eliminado";
    }

}

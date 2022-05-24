package com.backend.CriaTernerosBackEnd.Controlador;


import com.backend.CriaTernerosBackEnd.Modelo.Alimento;
import com.backend.CriaTernerosBackEnd.Servicios.AlimentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/alimento")
@CrossOrigin

public class AlimentoControlador {

    @Autowired
    private AlimentoServicio alimentoServicio;

    @PostMapping("/agregar")
    public String add(@RequestBody Alimento alimento){
        alimentoServicio.saveAlimento(alimento);
        return "Nuevo Alimento agregado";
    }

    @GetMapping("/getAll")
    public List<Alimento> list(){
        return alimentoServicio.getAllAlimentos();
    }


    @GetMapping("/eliminar/{id_alimento}")
    public String remove(@PathVariable int id_alimento){
        alimentoServicio.removeAlimento(id_alimento);
        return "Alimento Eliminado";
    }

}

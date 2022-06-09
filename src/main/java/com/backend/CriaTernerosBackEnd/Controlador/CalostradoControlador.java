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

import com.backend.CriaTernerosBackEnd.Modelo.Calostrado;
import com.backend.CriaTernerosBackEnd.Servicios.CalostradoServicio;

@RestController
@RequestMapping("/calostrado")
@CrossOrigin

public class CalostradoControlador {
	
	 @Autowired
		public CalostradoServicio calostradoServicio;

	    @PostMapping("/agregar")
	    public String add(@RequestBody Calostrado calostrado){
	        calostradoServicio.saveCalostrado(calostrado);
	        return "Nuevo Calostrado agregado";
	    }

	    @GetMapping("/getAll")
	    public List<Calostrado> list(){
	        return calostradoServicio.getAllCalostrados();
	    }


	    @GetMapping("/eliminar/{id_calostrado}")
	    public String remove(@PathVariable int id_calostrado){
	        calostradoServicio.removeCalostrado(id_calostrado);
	        return "Calostrado Eliminado";
	    }

}


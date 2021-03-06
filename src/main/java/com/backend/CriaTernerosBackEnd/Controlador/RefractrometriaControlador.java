package com.backend.CriaTernerosBackEnd.Controlador;

import java.util.List;
import java.util.Optional;

import com.backend.CriaTernerosBackEnd.Modelo.Ternero;
import com.backend.CriaTernerosBackEnd.Modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.CriaTernerosBackEnd.Modelo.Refractrometria;
import com.backend.CriaTernerosBackEnd.Servicios.RefractrometriaServicio;

@RestController
@RequestMapping("/refractrometria")
@CrossOrigin

public class RefractrometriaControlador {
	
	 @Autowired
		public RefractrometriaServicio refractrometriaServicio;

	    @PostMapping("/agregar")
	    public String add(@RequestBody Refractrometria refractrometria){
	        refractrometriaServicio.saveRefractrometria(refractrometria);
	        return "Nuevo Refractrometria agregado";
	    }

	    @GetMapping("/getAll")
	    public List<Refractrometria> list(){
	        return refractrometriaServicio.getAllRefractrometrias();
	    }

	@GetMapping("/getById/{id_refractrometria}")
	public Optional<Refractrometria> list(@PathVariable int id_refractrometria){
		return refractrometriaServicio.findById(id_refractrometria);
	}


	    @GetMapping("/eliminar/{id_refractrometria}")
	    public String remove(@PathVariable int id_refractrometria){
	        refractrometriaServicio.removeRefractrometria(id_refractrometria);
	        return "Refractrometria Eliminado";
	    }

	@GetMapping("/verificarTern/{id}")
	public Refractrometria findByTernId(@PathVariable int id){
		return refractrometriaServicio.findByTernId(id);

	}

}

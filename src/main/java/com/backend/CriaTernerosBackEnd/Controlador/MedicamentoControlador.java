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

import com.backend.CriaTernerosBackEnd.Modelo.Medicamento;
import com.backend.CriaTernerosBackEnd.Servicios.MedicamentoServicio;

@RestController
@RequestMapping("/medicamento")
@CrossOrigin
public class MedicamentoControlador {
	
	 @Autowired
	    private MedicamentoServicio medicamentoServicio;

	    @PostMapping("/agregar")
	    public String add(@RequestBody Medicamento medicamento){
	        medicamentoServicio.saveMedicamento(medicamento);
	        return "Nuevo Medicamento agregado";
	    }

	    @GetMapping("/getAll")
	    public List<Medicamento> list(){
	        return medicamentoServicio.getAllMedicamentos();
	    }


	    @GetMapping("/eliminar/{id_medicamento}")
	    public String remove(@PathVariable int id_medicamento){
	        medicamentoServicio.removeMedicamento(id_medicamento);
	        return "Medicamento Eliminado";
	    }


}

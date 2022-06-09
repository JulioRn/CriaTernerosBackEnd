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

import com.backend.CriaTernerosBackEnd.Modelo.Muerte;
import com.backend.CriaTernerosBackEnd.Modelo.Ternero;
import com.backend.CriaTernerosBackEnd.Servicios.MuerteServicio;

@RestController
@RequestMapping("/muerte")
@CrossOrigin

public class MuerteControlador {
	
	 @Autowired
		public MuerteServicio muerteServicio;

	    @PostMapping("/agregar")
	    public String add(@RequestBody Muerte muerte){
	        muerteServicio.saveMuerte(muerte);
	        return "Nuevo Muerte agregado";
	    }

	    @GetMapping("/getAll")
	    public List<Muerte> list(){
	        return muerteServicio.getAllMuertes();
	    }


	    @GetMapping("/eliminar/{id_muerte}")
	    public String remove(@PathVariable int id_muerte){
	        muerteServicio.removeMuerte(id_muerte);
	        return "Muerte Eliminado";
	    }
	    
	    @GetMapping("/entreFechasMuerte/{from}/{to}")
        public List<Muerte> getMuerteBetween(@PathVariable @DateTimeFormat (iso = DateTimeFormat.ISO.DATE_TIME) Date from,@PathVariable @DateTimeFormat (iso = DateTimeFormat.ISO.DATE_TIME) Date to){
    	List<Muerte> muer= muerteServicio.entreFechasMuerte(from, to );
    	
    	return muer;
	    }

}

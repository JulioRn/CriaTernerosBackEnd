package com.backend.CriaTernerosBackEnd.Controlador;

import com.backend.CriaTernerosBackEnd.Modelo.Usuario;
import com.backend.CriaTernerosBackEnd.Servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioControlador {
    @Autowired
	public UsuarioServicio usuarioServicio;

    @PostMapping("/agregar")
    public String add(@RequestBody Usuario usuario){
        usuarioServicio.saveUsuario(usuario);
        return "Nuevo Usuario agregado";
    }

    @GetMapping("/getAll")
    public List<Usuario> list(){
        return usuarioServicio.getAllUsuarios();
    }


    @GetMapping("/eliminar/{id_usuario}")
    public String remove(@PathVariable int id_usuario){
        usuarioServicio.removeUsuario(id_usuario);
        return "Usuario Eliminado";
    }

    @GetMapping("/buscarUsuario/{acceso}/{contra}")
    public Usuario taerCuenta(@PathVariable String acceso, @PathVariable String contra){
        return usuarioServicio.buscarUsuario(acceso, contra);

    }

}

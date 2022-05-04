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
    private UsuarioServicio usuarioServicio;

    @PostMapping("/agregar")
    public String add(@RequestBody Usuario usuario){
        usuarioServicio.saveUsuario(usuario);
        return "Nuevo Usuario agregado";
    }

    @GetMapping("/getAll")
    public List<Usuario> list(){
        return usuarioServicio.getAllUsuarios();
    }


    @GetMapping("/eliminar/{id}")
    public String remove(@PathVariable int id){
        usuarioServicio.removeUsuario(id);
        return "Usuario Eliminado";
    }
}

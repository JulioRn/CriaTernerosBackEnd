package com.backend.CriaTernerosBackEnd.Servicios;

import com.backend.CriaTernerosBackEnd.Modelo.Usuario;
import com.backend.CriaTernerosBackEnd.Repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicioImp implements UsuarioServicio{
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public void removeUsuario(int id) {
         usuarioRepositorio.deleteById(id);
    }
}

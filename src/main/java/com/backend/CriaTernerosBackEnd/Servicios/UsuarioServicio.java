package com.backend.CriaTernerosBackEnd.Servicios;

import com.backend.CriaTernerosBackEnd.Modelo.Usuario;

import java.util.List;

public interface UsuarioServicio {
    public Usuario saveUsuario(Usuario usuario);
    public List<Usuario> getAllUsuarios();

    public void removeUsuario(int id);
}

package com.backend.CriaTernerosBackEnd.Servicios;



import java.util.List;

import com.backend.CriaTernerosBackEnd.Modelo.Usuario;

public interface UsuarioServicio {
    public Usuario saveUsuario(Usuario usuario);
    public List<Usuario> getAllUsuarios();
    public Usuario buscarUsuario(String acceso, String contra );
    public void removeUsuario(int id);
}

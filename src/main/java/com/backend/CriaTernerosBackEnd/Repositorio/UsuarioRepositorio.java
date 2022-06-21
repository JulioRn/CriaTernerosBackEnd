package com.backend.CriaTernerosBackEnd.Repositorio;

import com.backend.CriaTernerosBackEnd.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {

    @Query("select p from Usuario p where p.acceso=:acceso and p.contra=:contra" )
    Usuario findByAccesoAndContra(@Param("acceso") String acceso, @Param("contra") String contra);

}

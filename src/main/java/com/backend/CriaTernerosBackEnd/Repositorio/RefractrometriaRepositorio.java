package com.backend.CriaTernerosBackEnd.Repositorio;

import com.backend.CriaTernerosBackEnd.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Refractrometria;

@Repository
public interface RefractrometriaRepositorio extends JpaRepository<Refractrometria, Integer> {

    @Query(value= "Select * from refractrometria where id_ternero= :ternId", nativeQuery = true )
    Refractrometria findByTernId(@Param("ternId") int ternId);

}
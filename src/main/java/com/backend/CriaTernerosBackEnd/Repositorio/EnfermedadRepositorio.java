package com.backend.CriaTernerosBackEnd.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Enfermedad;

@Repository
public interface EnfermedadRepositorio extends JpaRepository<Enfermedad, Integer>  {

}

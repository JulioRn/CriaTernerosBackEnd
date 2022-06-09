package com.backend.CriaTernerosBackEnd.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Refractrometria;

@Repository
public interface RefractrometriaRepositorio extends JpaRepository<Refractrometria, Integer> {

}
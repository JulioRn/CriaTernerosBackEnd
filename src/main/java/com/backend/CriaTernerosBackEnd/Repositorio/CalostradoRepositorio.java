package com.backend.CriaTernerosBackEnd.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Calostrado;

@Repository
public interface CalostradoRepositorio extends JpaRepository<Calostrado, Integer> {

}

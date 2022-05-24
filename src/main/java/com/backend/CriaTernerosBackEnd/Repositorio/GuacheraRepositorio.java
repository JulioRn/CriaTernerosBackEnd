package com.backend.CriaTernerosBackEnd.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Guachera;

@Repository
public interface GuacheraRepositorio extends JpaRepository<Guachera, Integer> {



}

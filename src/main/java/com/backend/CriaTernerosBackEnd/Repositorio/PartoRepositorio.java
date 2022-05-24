package com.backend.CriaTernerosBackEnd.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Parto;

@Repository
public interface PartoRepositorio extends JpaRepository<Parto, Integer> {

}

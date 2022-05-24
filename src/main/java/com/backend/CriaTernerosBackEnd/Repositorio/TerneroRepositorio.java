package com.backend.CriaTernerosBackEnd.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Ternero;

@Repository
public interface TerneroRepositorio extends JpaRepository<Ternero, Integer> {

}

package com.backend.CriaTernerosBackEnd.Repositorio;



import com.backend.CriaTernerosBackEnd.Modelo.Alimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepositorio extends JpaRepository<Alimento, Integer> {



}

package com.backend.CriaTernerosBackEnd.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Medicamento;

@Repository
public interface MedicamentoRepositorio extends JpaRepository<Medicamento, Integer> {

}

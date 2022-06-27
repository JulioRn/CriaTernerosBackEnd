package com.backend.CriaTernerosBackEnd.Repositorio;

import com.backend.CriaTernerosBackEnd.Modelo.Madre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MadreRepositorio extends JpaRepository<Madre, Integer> {

}

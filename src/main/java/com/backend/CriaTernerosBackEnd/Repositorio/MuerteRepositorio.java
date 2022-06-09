package com.backend.CriaTernerosBackEnd.Repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Muerte;


@Repository
public interface MuerteRepositorio extends JpaRepository<Muerte, Integer> {
	
	@Query("select d from Muerte d where d.fecha >= :from and d.fecha <= :to ")
	List<Muerte> findByStartDateBetween(@Param("from") Date from, @Param("to") Date to);
	

}
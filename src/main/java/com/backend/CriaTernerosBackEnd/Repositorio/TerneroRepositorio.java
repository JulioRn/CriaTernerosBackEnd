package com.backend.CriaTernerosBackEnd.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backend.CriaTernerosBackEnd.Modelo.Ternero;

import java.util.Date;
import java.util.List;

@Repository
public interface TerneroRepositorio extends JpaRepository<Ternero, Integer> {
    @Query("select d from Ternero d where d.fechaNac >= :from and d.fechaNac <= :to ")
        //List<Deal> findByCreatedDateBetween(@Param("from") Date from, @Param("to") Date to);
    List<Ternero> findByStartDateBetween(@Param("from") Date from, @Param("to") Date to);

    @Query("select q from Ternero q where month(q.fechaNac) = month(CURRENT_TIMESTAMP) and year(q.fechaNac) = year(CURRENT_TIMESTAMP)")
    List<Ternero> FindByTerneroActivoDate();

}

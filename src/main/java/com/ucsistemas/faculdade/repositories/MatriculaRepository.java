package com.ucsistemas.faculdade.repositories;

import com.ucsistemas.faculdade.domain.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

    List<Matricula> findAll();
}

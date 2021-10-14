package com.ucsistemas.faculdade.repositories;

import com.ucsistemas.faculdade.domain.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {

    List<Disciplina> findAll();

}

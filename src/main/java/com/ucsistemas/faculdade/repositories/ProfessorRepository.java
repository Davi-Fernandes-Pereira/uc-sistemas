package com.ucsistemas.faculdade.repositories;

import com.ucsistemas.faculdade.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorRepository  extends JpaRepository<Professor, Integer> {

    List<Professor> findAll();
}

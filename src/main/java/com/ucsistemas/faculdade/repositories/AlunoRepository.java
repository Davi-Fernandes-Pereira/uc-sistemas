package com.ucsistemas.faculdade.repositories;

import com.ucsistemas.faculdade.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    List<Aluno> findAll();

    List<Aluno> findByNome(String nome);
}

package com.ucsistemas.faculdade.repositories;


import com.ucsistemas.faculdade.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    List<Cidade> findAll();
}

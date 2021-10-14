package com.ucsistemas.faculdade.services;

import com.ucsistemas.faculdade.domain.Professor;
import com.ucsistemas.faculdade.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public void salvar(Professor professor) {
        this.professorRepository.save(professor);
    }

    public List<Professor> buscarTodos() {
        return this.professorRepository.findAll();
    }

    public Professor buscaPorId(@PathVariable Integer id) {
        return this.professorRepository.findById(id).orElse(null);
    }

    public void deletaPorId(Integer id) {
        professorRepository.deleteById(id);
    }

    public Professor altera(Professor professor) {
        return professorRepository.save(professor);
    }
}

package com.ucsistemas.faculdade.services;


import com.ucsistemas.faculdade.domain.Disciplina;
import com.ucsistemas.faculdade.domain.Professor;
import com.ucsistemas.faculdade.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Objects;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    @Autowired
    private com.ucsistemas.faculdade.services.ProfessorService professorService;

    public void salvar(Disciplina disciplina) throws Exception {
        Professor professor = professorService.buscaPorId(disciplina.getProfessor().getId());
        if (Objects.nonNull(professor)) {
            disciplina.setProfessor(professor);
            this.repository.save(disciplina);
            return;
        }
        throw new Exception("Professor não cadastrado");
    }

    public List<Disciplina> buscarTodos() {
        return this.repository.findAll();
    }

    public Disciplina buscaPorId(@PathVariable Integer id) {
        return this.repository.findById(id).orElse(null);
    }

    public void deletaPorId(Integer id) {
        repository.deleteById(id);
    }

    public Disciplina altera(Disciplina disciplina) {
        Disciplina d = buscaPorId(disciplina.getId());
        d.setNome(disciplina.getNome());
        Professor professor = professorService.buscaPorId(disciplina.getProfessor().getId());
        d.setProfessor(professor);
        return repository.save(disciplina);
    }
}

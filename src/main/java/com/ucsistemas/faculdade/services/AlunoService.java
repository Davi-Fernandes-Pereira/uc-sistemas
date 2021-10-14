package com.ucsistemas.faculdade.services;
;
import com.ucsistemas.faculdade.domain.Aluno;
import com.ucsistemas.faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> listaTodos() {
        return alunoRepository.findAll();
    }

    public Aluno buscaPorId(Integer id) {
        return alunoRepository.findById(id).orElse(null);
    }

    public void adicionaAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public void deletaPorId(Integer id) {
        alunoRepository.deleteById(id);
    }

    public Aluno altera(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> buscaPorNome(String nome) {
        return alunoRepository.findByNome(nome);
    }
}

package com.ucsistemas.faculdade.services;

import com.ucsistemas.faculdade.domain.Matricula;
import com.ucsistemas.faculdade.repositories.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    public List<Matricula> listaTodos() {
        return matriculaRepository.findAll();
    }

    public void salvar(Matricula cidade) {
        this.matriculaRepository.save(cidade);
    }

    public List<Matricula> buscarTodos() {
        return this.matriculaRepository.findAll();
    }

    public Matricula buscaPorId(@PathVariable Integer id) {
        return this.matriculaRepository.findById(id).orElse(null);
    }

    public void deletaPorId(Integer id) {
        matriculaRepository.deleteById(id);
    }

    public Matricula altera(Matricula cidade) {
        return matriculaRepository.save(cidade);
    }

    public void adicionaAluno(Matricula matricula) {
        matriculaRepository.save(matricula);
    }

}

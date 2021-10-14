package com.ucsistemas.faculdade.resources;

import com.ucsistemas.faculdade.domain.Aluno;
import com.ucsistemas.faculdade.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoResource {

    @Autowired
    AlunoService service;

    @GetMapping("/lista")
    public List<Aluno> listaTodos() {
        return service.listaTodos();
    }

    @GetMapping("/busca-aluno/{id}")
    public Aluno buscaPorId(@PathVariable Integer id) {
        return service.buscaPorId(id);
    }

    @PostMapping("/cadastrar")
    public void listaTodos(@RequestBody Aluno aluno) {
         service.adicionaAluno(aluno);
    }

    @PutMapping("/alterar")
    public Aluno alterar(@RequestBody Aluno aluno) {
        return service.altera(aluno);
    }

    @DeleteMapping("/deleta-aluno/{id}")
    public void deletaPorId(@PathVariable Integer id) {
        service.deletaPorId(id);
    }

    @GetMapping("/busca-por-nome/{nome}")
    public List<Aluno> buscaPorNome(@PathVariable String nome) {
        return service.buscaPorNome(nome);
    }
}

package com.ucsistemas.faculdade.resources;


import com.ucsistemas.faculdade.domain.Aluno;
import com.ucsistemas.faculdade.domain.Matricula;
import com.ucsistemas.faculdade.services.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("matricula")
public class MatriculaResource {

    @Autowired
    private MatriculaService service;

    @PostMapping
    public void salvar(@RequestBody Matricula matricula) throws Exception {
        this.service.salvar(matricula);
    }

    @PostMapping("/cadastrar")
    public void listaTodos(@RequestBody Matricula matricula) {
        service.adicionaAluno(matricula);
    }

    @GetMapping("/lista")
    public List<Matricula> listaTodos() {
        return service.listaTodos();
    }


    @GetMapping()
    public List<Matricula> buscarTodos() {
        return this.service.buscarTodos();
    }

    @PutMapping("/alterar")
    public Matricula alterar(@RequestBody Matricula matricula) {
        return service.altera(matricula);
    }

    @DeleteMapping("/deleta-matricula/{id}")
    public void deletaPorId(@PathVariable Integer id) {
        service.deletaPorId(id);
    }

    @GetMapping("/busca-matricula/{id}")
    public Matricula buscaPorId(@PathVariable Integer id) {
        return service.buscaPorId(id);
    }
}

package com.ucsistemas.faculdade.resources;


import com.ucsistemas.faculdade.domain.Professor;
import com.ucsistemas.faculdade.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professor")
public class ProfessorResource {

    @Autowired
    private ProfessorService service;

    @PostMapping
    public void salvar(@RequestBody Professor professor) {
        this.service.salvar(professor);
    }

    @GetMapping()
    public List<Professor> buscarTodos() {
        return this.service.buscarTodos();
    }

    @PutMapping("/alterar")
    public Professor alterar(@RequestBody Professor professor) {
        return service.altera(professor);
    }

    @DeleteMapping("/deleta-professor/{id}")
    public void deletaPorId(@PathVariable Integer id) {
        service.deletaPorId(id);
    }

    @GetMapping("/busca-professor/{id}")
    public Professor buscaPorId(@PathVariable Integer id) {
        return service.buscaPorId(id);
    }
}

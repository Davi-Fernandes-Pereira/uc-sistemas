package com.ucsistemas.faculdade.resources;


import com.ucsistemas.faculdade.domain.Disciplina;
import com.ucsistemas.faculdade.services.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("disciplina")
public class DisciplinaResource {

    @Autowired
    private DisciplinaService service;

    @PostMapping
    public void salvar(@RequestBody Disciplina disciplina) throws Exception {
        this.service.salvar(disciplina);
    }

    @GetMapping()
    public List<Disciplina> buscarTodos() {
        return this.service.buscarTodos();
    }

    @PutMapping("/alterar")
    public Disciplina alterar(@RequestBody Disciplina disciplina) {
        return service.altera(disciplina);
    }

    @DeleteMapping("/deleta-disciplina/{id}")
    public void deletaPorId(@PathVariable Integer id) {
        service.deletaPorId(id);
    }

    @GetMapping("/busca-disciplina/{id}")
    public Disciplina buscaPorId(@PathVariable Integer id) {
        return service.buscaPorId(id);
    }
}

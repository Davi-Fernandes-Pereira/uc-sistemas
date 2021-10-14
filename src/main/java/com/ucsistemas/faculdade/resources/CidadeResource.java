package com.ucsistemas.faculdade.resources;


import com.ucsistemas.faculdade.domain.Cidade;
import com.ucsistemas.faculdade.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cidade")
public class CidadeResource {

    @Autowired
    private CidadeService service;

    @PostMapping
    public void salvar(@RequestBody Cidade cidade) throws Exception {
        this.service.salvar(cidade);
    }

    @GetMapping()
    public List<Cidade> buscarTodos() {
        return this.service.buscarTodos();
    }

    @PutMapping("/alterar")
    public Cidade alterar(@RequestBody Cidade cidade) {
        return service.altera(cidade);
    }

    @DeleteMapping("/deleta-cidade/{id}")
    public void deletaPorId(@PathVariable Integer id) {
        service.deletaPorId(id);
    }

    @GetMapping("/busca-cidade/{id}")
    public Cidade buscaPorId(@PathVariable Integer id) {
        return service.buscaPorId(id);
    }
}

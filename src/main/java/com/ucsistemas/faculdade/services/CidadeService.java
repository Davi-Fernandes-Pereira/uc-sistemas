package com.ucsistemas.faculdade.services;



import com.ucsistemas.faculdade.domain.Cidade;
import com.ucsistemas.faculdade.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public void salvar(Cidade cidade) {
        this.cidadeRepository.save(cidade);
    }

    public List<Cidade> buscarTodos() {
        return this.cidadeRepository.findAll();
    }

    public Cidade buscaPorId(@PathVariable Integer id) {
        return this.cidadeRepository.findById(id).orElse(null);
    }

    public void deletaPorId(Integer id) {
        cidadeRepository.deleteById(id);
    }

    public Cidade altera(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

}

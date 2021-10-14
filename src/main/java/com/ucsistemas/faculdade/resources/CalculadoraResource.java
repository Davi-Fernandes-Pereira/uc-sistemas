package com.ucsistemas.faculdade.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraResource {

    @GetMapping("{operacao}")
    public Double calcular(@PathVariable String operacao, @RequestParam Double n1, @RequestParam Double n2) throws Exception {
        if (operacao.equals("adicao")) {
            return n1 + n2;
        } else if (operacao.equals("subtracao")) {
            return n1 - n2;
        } else if  (operacao.equals("multiplicacao")) {
            return n1 * n2;
        } else if  (operacao.equals("divisao")) {
            return n1 / n2;
        }
        throw new Exception("Operação inválida");
    }

}

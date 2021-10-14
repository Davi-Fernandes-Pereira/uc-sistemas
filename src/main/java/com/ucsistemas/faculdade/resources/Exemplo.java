package com.ucsistemas.faculdade.resources;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exemplo")
public class Exemplo {

    @GetMapping()
    public String boasVindas() {
        return "Seja bem vindo";
    }

    @GetMapping("url")
    public String boasVindasNome(@RequestParam String nome, @RequestParam Integer idade) {
        String ret = nome + " Seja bem vindo";
        if (idade >= 18) {
            ret += "\nVocê é maior de idade";
        } else {
            ret += "\nVocê é menor de idade";
        }
        return  ret;
    }

    @GetMapping("dinamica/{nome}")
    public String boasVindasDinamica(@PathVariable String nome) {
        return "Boas vindas " + nome;
    }

}

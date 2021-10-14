package com.ucsistemas.faculdade.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String formacao;

    public Professor() {
    }

    public Professor(Integer id, String nome, String formacao) {
        this.id = id;
        this.nome = nome;
        this.formacao = formacao;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFormacao() {
        return formacao;
    }
}

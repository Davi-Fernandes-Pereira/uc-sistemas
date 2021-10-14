package com.ucsistemas.faculdade.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @ManyToOne
    private Professor professor;

    public Disciplina() {
    }

    public Disciplina(Integer id, String nome, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(professor, that.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, professor);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

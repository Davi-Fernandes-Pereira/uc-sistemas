package com.ucsistemas.faculdade.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Column(name = "nota1")
    private Double n1;

    @Column(name = "nota2")
    private Double n2;

    @Column(name = "nota3")
    private Double n3;

    public Aluno() {
    }

    public Aluno(Integer id, String nome, Double n1, Double n2, Double n3) {
        this.id = id;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
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

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(id, aluno.id) && Objects.equals(nome, aluno.nome) && Objects.equals(n1, aluno.n1) && Objects.equals(n2, aluno.n2) && Objects.equals(n3, aluno.n3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, n1, n2, n3);
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", n1=" + n1 +
                ", n2=" + n2 +
                ", n3=" + n3 +
                '}';
    }
}

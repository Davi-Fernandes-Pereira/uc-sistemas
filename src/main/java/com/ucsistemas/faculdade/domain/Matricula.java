package com.ucsistemas.faculdade.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Matricula {

    @EmbeddedId
    private MatriculaPK id;
    private String semestre;

    public Matricula() {
    }

    public Matricula(MatriculaPK id, String semestre) {
        this.id = id;
        this.semestre = semestre;
    }

    public MatriculaPK getId() {
        return id;
    }

    public void setId(MatriculaPK id) {
        this.id = id;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", semestre='" + semestre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(id, matricula.id) && Objects.equals(semestre, matricula.semestre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, semestre);
    }
}
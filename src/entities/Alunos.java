package entities;

import java.util.Date;

public class Alunos implements Comparable<Alunos> {
    private Integer id;
    private String name;
    private Date nascimento;
    private Integer nota;

    public Alunos() {
    }

    public Alunos(Integer id, String name, Date nascimento, Integer nota) {
        this.id = id;
        this.name = name;
        this.nascimento = nascimento;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Alunos other) {
        int notaComparison = -nota.compareTo(other.getNota());

        if (notaComparison == 0) {
            return nascimento.compareTo(other.getNascimento());
        }

        return notaComparison;
    }

}

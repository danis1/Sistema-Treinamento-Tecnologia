package br.edu.fatecpg.tecnologia.model;

public class Aluno {
    private String nome;
    private double notaFinal;

    public Aluno(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}

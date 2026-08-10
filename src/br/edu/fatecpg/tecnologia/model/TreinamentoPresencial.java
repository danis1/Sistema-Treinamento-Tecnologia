package br.edu.fatecpg.tecnologia.model;

import java.util.ArrayList;

public class TreinamentoPresencial extends Treinamento{
    private String local;

    public TreinamentoPresencial(int id, String nomeInstrutor, String linguagemEnsinada, ArrayList<Aluno> alunos, String local) {
        super(id, nomeInstrutor, linguagemEnsinada, alunos);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void validarLocal() {
        System.out.println("Local verificado!");
    }
}

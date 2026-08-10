package br.edu.fatecpg.tecnologia.model;
import java.time.LocalDate;
import java.util.ArrayList;



public class Treinamento {
    private int id;
    private String nomeInstrutor;
    private String linguagemEnsinada;
    private ArrayList<Aluno> alunos;
    private int cargaHoraria;
    private int data = 5;

    public Treinamento(int id, String nomeInstrutor, String linguagemEnsinada, ArrayList<Aluno> alunos) {
        this.id = id;
        this.nomeInstrutor = nomeInstrutor;
        this.linguagemEnsinada = linguagemEnsinada;
        this.alunos = alunos;
    }


    public int getId() {
        return id;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public String getLinguagemEnsinada() {
        return linguagemEnsinada;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public int getData() {
        return data;
    }


    public void verificarDisponibilidade(){
        if (this.alunos.size() < 5){
            int vagas = 5 - this.alunos.size();
            System.out.println("Há " + vagas + " vagas disponíveis");
        } else{
            System.out.println("Não há vagas disponíveis");
        }
    }


    public void definirCargaHoraria(int horas){
        this.cargaHoraria = horas;
        System.out.println("Carga horária definida com sucesso");
    }

    public void verificarUltimoTreinamento(int d) {
        if (d < 1 || d > 12) {
            System.out.println("Data inválida");
        } else {
            System.out.println("Último treinamento: mês " + d);
            int dataDois = this.data - 2;
            if (d >= dataDois && d <= this.data) {
                System.out.println("Indisponível. Aguarde o período de espera.");
            } else {
                System.out.println("Disponível para treinamento");
            }
        }
    }

    public void calcularMediaAlunos(){
        double soma = 0;

        if (this.alunos == null || this.alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (Aluno a : this.alunos){
        soma += a.getNotaFinal();}
        double media = soma / this.alunos.size();
        System.out.println("A média final: " + media);
    }
}


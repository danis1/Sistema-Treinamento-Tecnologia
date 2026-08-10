package br.edu.fatecpg.tecnologia.view;

import br.edu.fatecpg.tecnologia.model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", 9.5));
        alunos.add(new Aluno("Carlos", 8.0));
        alunos.add(new Aluno("Beatriz", 7.5));

        TreinamentoPresencial presencial = new TreinamentoPresencial(1, "Sérgio", "Java", alunos, "Lab 04 - Bloco A");
        TreinamentoOnline online = new TreinamentoOnline(2, "Fernanda", "Python", alunos, "https://meet.google.com/abc-defg-hij");

        presencial.validarLocal();
        presencial.verificarDisponibilidade();
        presencial.definirCargaHoraria(40);
        presencial.calcularMediaAlunos();

        System.out.println("-----------------------------------");

        online.validarLink();
        online.verificarUltimoTreinamento(4);
        online.definirCargaHoraria(30);
    }
}
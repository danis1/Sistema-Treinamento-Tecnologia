package br.edu.fatecpg.tecnologia.model;
import java.util.ArrayList;

public class TreinamentoOnline extends Treinamento {

    private String linkAcesso;


    public TreinamentoOnline(int id, String nomeInstrutor, String linguagemEnsinada, ArrayList<Aluno> alunos, String linkAcesso) {
        super(id, nomeInstrutor, linguagemEnsinada, alunos);
        this.linkAcesso = linkAcesso;
    }


    public String getLinkAcesso() {
        return linkAcesso;
    }

    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }


    public void validarLink(){
        System.out.println("Link verificado: O treinamento está ONLINE!");
    }
}

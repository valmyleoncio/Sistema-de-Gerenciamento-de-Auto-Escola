package controllers;
import entities.Aluno;
import entities.AulaTeorica;
import views.PanelAulas;
import views.PanelAulasAluno;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SystemController {

    private static Aluno aluno = Aluno.getUser();

    private static AulaTeorica aulaSelecionada;

    public static Aluno dadosAluno(){
        return aluno;
    }

    public static String nameUser(){
        return dadosAluno().getNome();
    }

    public static String matriculaUser(){
        return dadosAluno().getMatricula();
    }

    public static String cpfUser(){
        return dadosAluno().getCpf();
    }

    public static int aulaTeoricaCumprida(){
        return dadosAluno().getAulasCumpridas();
    }

    public static Icon fotoUser(){
        return new ImageIcon(dadosAluno().getFoto());
    }

    public static List<AulaTeorica> listaAulasAluno(){
        return dadosAluno().getListaAulaTeorica();
    }

    public static void adicionarAulaAluno(AulaTeorica aula){

        List<AulaTeorica> aulaTeoricas = aluno.getListaAulaTeorica();
        aulaTeoricas.add(aulaSelecionada);
        aluno.setListaAulaTeorica(aulaTeoricas);

        List<Aluno> listaAlunos = aulaSelecionada.getListaAlunos();
        listaAlunos.add(aluno);
        aula.setListaAlunos(listaAlunos);

    }

    public static List<PanelAulas> listaPanelAulasTeoricasDisponiveis() {

        List<PanelAulas> panels = new ArrayList<>();
        for(AulaTeorica x: AulaTeorica.listaAulasDisponiveis()){
            PanelAulas panel = new PanelAulas(x);
            panels.add(panel);
        }

        for(AulaTeorica aula : dadosAluno().getListaAulaTeorica()){
            for(PanelAulas panel: panels){
                if(panel.getAulaTeorica().getDisciplina().getCodigo() == aula.getDisciplina().getCodigo()){
                    panel.mainPainel.setBackground(Color.red);
                }
            }
        }

        return panels;
    }

    public static List<PanelAulasAluno> liistaPanelAulaAluno() {

        List<PanelAulasAluno> panels = new ArrayList<>();
        for(AulaTeorica x: dadosAluno().getListaAulaTeorica()){
            PanelAulasAluno panel = new PanelAulasAluno(x);
            panels.add(panel);
        }
        return panels;
    }

    public static AulaTeorica getAulaSelecionada()  {
        return aulaSelecionada;
    }

    public static void setAulaSelecionada(AulaTeorica aulaSelecionada) {
        SystemController.aulaSelecionada = aulaSelecionada;
    }
}
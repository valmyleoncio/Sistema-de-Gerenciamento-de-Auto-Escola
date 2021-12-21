package entities;

import java.util.ArrayList;
import java.util.List;

public class AulaTeorica extends Aula{

    private Instrutor instrutor;
    private String nomeInstrutor;
    private Disciplina disciplina;
    private final String cargaHoraria = "50 min";
    private int sala;
    private List<Aluno> listaAlunos = new ArrayList<>();

    public AulaTeorica(String horario, String data, String  instrutor, int sala, Disciplina disciplina) {
        super(horario, data);
        this.nomeInstrutor = instrutor;
        this.sala = sala;
        this.disciplina = disciplina;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        this.nomeInstrutor = nomeInstrutor;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public int capacidadeAula() {
        return listaAlunos.size();
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public static List<AulaTeorica> listaAulasDisponiveis(){

        List<AulaTeorica> lista = new ArrayList<>();

        //Instrutor String mesmo, somente para testes
        AulaTeorica aula1 = new AulaTeorica("14:00", "19/12/2021", "Marcelo" , 6, new Disciplina("Primeiro socorros", "2"));
        AulaTeorica aula2 = new AulaTeorica("15:00", "19/12/2021", "Marcelo" , 6, new Disciplina("Primeiro socorros", "3"));
        AulaTeorica aula3 = new AulaTeorica("16:00", "19/12/2021", "Camilo" , 10, new Disciplina("Legislação           ", "4"));
        AulaTeorica aula4 = new AulaTeorica("07:00", "20/12/2021", "Camilo" , 3, new Disciplina( "Direção Defensiva", "5"));
        AulaTeorica aula5 = new AulaTeorica("08:00", "20/12/2021", "Leonardo" , 4, new Disciplina("Direção Defensiva", "6"));
        AulaTeorica aula6 = new AulaTeorica("09:00", "20/12/2021", "Matheus" , 2, new Disciplina("Direção Defensiva", "7"));
        AulaTeorica aula7 = new AulaTeorica("19:00", "20/12/2021", "Thiago" , 7, new Disciplina( "Meio Ambiente     ", "8"));
        AulaTeorica aula8 = new AulaTeorica("20:00", "20/12/2021", "Caio" , 11, new Disciplina(   "Mecânica              ", "9"));
        AulaTeorica aula9 = new AulaTeorica("21:00", "20/12/2021", "José" , 1, new Disciplina(   "Mecânica              ", "10"));

        lista.add(aula1);
        lista.add(aula2);
        lista.add(aula3);
        lista.add(aula4);
        lista.add(aula5);
        lista.add(aula6);
        lista.add(aula7);
        lista.add(aula8);
        lista.add(aula9);

        return  lista;
    }
}
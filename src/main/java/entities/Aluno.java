package entities;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

    private String matricula;
    private String foto;
    private String categoriaHabilitacao;
    private String periodo;
    private int renach;
    private List<Disciplina> listaDisciplina = new ArrayList<>();
    private List<AulaTeorica> listaAulaTeorica = new ArrayList<>();
    private int aulasCumpridas;

    public Aluno(String nome, int idade, String endereco, String cpf, String rg, String telefone,
                 String categoriaHabilitacao, String periodo, int renach) {
        super(nome, idade, endereco, cpf, rg, telefone);
        this.categoriaHabilitacao = categoriaHabilitacao;
        this.periodo = periodo;
        this.renach = renach;
    }

    public void inscreverAulaTeorica(AulaTeorica x){
        Aluno aluno = getUser();
        List<AulaTeorica> list1 = aluno.getListaAulaTeorica();
        list1.add(x);
        aluno.setListaAulaTeorica(list1);
    }

    public void solicitarAgendamentoAvaliacao(){

    }

    public void visualizarInformações(){}

    public static Aluno getUser() {

        Aluno John = new Aluno("Jhon", 20, "24456-132", "123.120.938-45", "381298397", "92131-3875",
                "B", "Noturno", 589273249);
        John.setMatricula("2021014278");
        John.setFoto("src\\main\\resources\\images\\fotoUserUm.png");
        John.setAulasCumpridas(30);
        John.getListaAulaTeorica().add(AulaTeorica.listaAulasDisponiveis().get(7));
        John.getListaAulaTeorica().add(AulaTeorica.listaAulasDisponiveis().get(8));

        Aluno Bob = new Aluno("Bob", 23, "28723-132", "130.796.500-83", "943787923", "95681-2134",
                "A", "Diurno", 71238563);
        Bob.setMatricula("2021014300");
        Bob.setFoto("src\\main\\resources\\images\\fotoUserDois.png");
        Bob.setAulasCumpridas(45);
        Bob.getListaAulaTeorica().add(AulaTeorica.listaAulasDisponiveis().get(0));
        Bob.getListaAulaTeorica().add(AulaTeorica.listaAulasDisponiveis().get(1));
        Bob.getListaAulaTeorica().add(AulaTeorica.listaAulasDisponiveis().get(3));

        return John;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCategoriaHabilitacao() {
        return categoriaHabilitacao;
    }

    public void setCategoriaHabilitacao(String categoriaHabilitacao) {
        this.categoriaHabilitacao = categoriaHabilitacao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getRenach() {
        return renach;
    }

    public void setRenach(int renach) {
        this.renach = renach;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Disciplina> getListaDisciplina() {
        return listaDisciplina;
    }

    public void setListaDisciplina(List<Disciplina> listaDisciplina) {
        this.listaDisciplina = listaDisciplina;
    }

    public int getAulasCumpridas() {
        return aulasCumpridas;
    }

    public void setAulasCumpridas(int aulasCumpridas) {
        this.aulasCumpridas = aulasCumpridas;
    }

    public List<AulaTeorica> getListaAulaTeorica() {
        return listaAulaTeorica;
    }

    public void setListaAulaTeorica(List<AulaTeorica> listaAulaTeorica) {
        this.listaAulaTeorica = listaAulaTeorica;
    }
}

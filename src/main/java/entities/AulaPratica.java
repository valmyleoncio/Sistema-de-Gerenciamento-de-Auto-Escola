package entities;

public class AulaPratica extends Aula{

    private Instrutor instrutor;
    private Aluno aluno;

    public AulaPratica(String horario, String data, Instrutor instrutor, Aluno aluno) {
        super(horario, data);
        this.instrutor = instrutor;
        this.aluno = aluno;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}

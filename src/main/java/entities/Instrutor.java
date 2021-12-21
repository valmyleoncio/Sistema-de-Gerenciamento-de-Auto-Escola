package entities;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa{

    private int numeroCredencial;
    private List<Disciplina> listaDisciplina = new ArrayList<>();

    public Instrutor(String nome, int idade, String endereco, String cpf, String rg, String telefone,
                     int numeroCredencial) {
        super(nome, idade, endereco, cpf, rg, telefone);
        this.numeroCredencial = numeroCredencial;
    }

    public void confirmarPresenca(){}

    public int getNumeroCredencial() {
        return numeroCredencial;
    }

    public void setNumeroCredencial(int numeroCredencial) {
        this.numeroCredencial = numeroCredencial;
    }
}

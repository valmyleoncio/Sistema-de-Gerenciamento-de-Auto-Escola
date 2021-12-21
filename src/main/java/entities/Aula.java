package entities;

public abstract class Aula {

    private String horario;
    private String data;

    public Aula(String horario, String data){
        this.horario = horario;
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

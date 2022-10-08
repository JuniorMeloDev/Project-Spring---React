package ExercicioAeronave;

public class Modelo {
    
    private int idModelo;
    private String sigla;
    private int capacidadeMaxima;
    private int autonomiaVoo;

    public Modelo(int idModelo, String sigla, int capacidadeMaxima, int autonomiaVoo) {
        this.idModelo = idModelo;
        this.sigla = sigla;
        this.capacidadeMaxima = capacidadeMaxima;
        this.autonomiaVoo = autonomiaVoo;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getAutonomiaVoo() {
        return autonomiaVoo;
    }

    public void setAutonomiaVoo(int autonomiaVoo) {
        this.autonomiaVoo = autonomiaVoo;
    }
    
    
}

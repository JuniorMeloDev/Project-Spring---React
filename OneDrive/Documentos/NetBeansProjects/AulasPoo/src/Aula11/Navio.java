
package Aula11;

public abstract class  Navio {

private int id;
private String nome;
private int quantidadePoroes;
private float capacidadeCarga;
private String disponibilidade;

    public Navio(int id, String nome, int quantidadePoroes, float capacidadeCarga) {
        this.id = id;
        this.nome = nome;
        this.quantidadePoroes = quantidadePoroes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = "Vazio";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePoroes() {
        return quantidadePoroes;
    }

    public void setQuantidadePoroes(int quantidadePoroes) {
        this.quantidadePoroes = quantidadePoroes;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void iniciaCarregamento() {
        this.disponibilidade = "Disponivel";
    }
    
    public void bloqueiaCarregamento() {
        this.disponibilidade = "Lotado";   
    }
    
}

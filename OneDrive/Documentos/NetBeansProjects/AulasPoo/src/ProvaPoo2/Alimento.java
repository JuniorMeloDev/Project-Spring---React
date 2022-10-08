
package ProvaPoo2;

public class Alimento {
    
    private int idAlimento;
    private String descricao;
    private double calorias;

    public Alimento(int idAlimento, String descricao, double calorias) {
        this.idAlimento = idAlimento;
        this.descricao = descricao;
        this.calorias = calorias;
    }

    public int getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(int idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    
    
    
}

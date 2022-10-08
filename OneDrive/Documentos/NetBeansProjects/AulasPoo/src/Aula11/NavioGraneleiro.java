
package Aula11;

public class NavioGraneleiro extends Navio {
    
    private int quantidadeEscotilhas;

    public NavioGraneleiro(int id, String nome, int quantidadePoroes, float capacidadeCarga, int quantidadeEscotilhas) {
        super(id, nome, quantidadePoroes, capacidadeCarga);
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }

    public int getQuantidadeEscotilhas() {
        return quantidadeEscotilhas;
    }

    public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }
    
}

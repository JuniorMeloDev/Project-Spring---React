package ExercicioAeronave;

public class Fabricante {
    
    private int idFabricante;
    private String nomeFantasia;
    private String nacionalidade;
    private double precoAcoes;

    public Fabricante(int idFabricante, String nomeFantasia, String nacionalidade, double precoAcoes) {
        this.idFabricante = idFabricante;
        this.nomeFantasia = nomeFantasia;
        this.nacionalidade = nacionalidade;
        this.precoAcoes = precoAcoes;
    }

    public int getIdFabricante() {
        return idFabricante;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getPrecoAcoes() {
        return precoAcoes;
    }

    public void setPrecoAcoes(double precoAcoes) {
        this.precoAcoes = precoAcoes;
    }
    
    public void atualizarAcoes(double valor) {
        this.precoAcoes = valor;
        
    }
    
    public void status() {
        
        System.out.println("----------------- Status Fabricante ----------------------\n");
        System.out.println("ID Fabricante: " + this.idFabricante);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Nome Fantasia: " +this.nomeFantasia);
        System.out.println("Preço Atualizado Ações: " +this.precoAcoes);
    }
    
}

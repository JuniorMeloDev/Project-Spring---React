package ProvaPoo;

public class Elevador {
    
    private int idElevador;
    private int vagasTotais;
    private int vagasDisponiveis;
    private double cargaLimite;
    private double cargaAtual;
    private boolean diponivel;
   
    public Elevador(int idElevador, int vagasDisponiveis, double cargaLimite, double cargaAtual, boolean diponivel) {
        this.idElevador = idElevador;
        this.vagasTotais = vagasTotais;
        this.vagasDisponiveis = vagasDisponiveis;
        this.cargaLimite = cargaLimite;
        this.cargaAtual = cargaAtual;
        this.diponivel = diponivel;
    }

 

    public int getIdElevador() {
        return idElevador;
    }

     public int getVagasTotais() {
        return vagasTotais;
    }

      public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public double getCargaLimite() {
        return cargaLimite;
    }

    public void setCargaLimite(double cargaLimite) {
        this.cargaLimite = cargaLimite;
    }

    public double getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(double cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    public boolean isDiponivel() {
        return diponivel;
    }

    public void setDiponivel(boolean diponivel) {
        this.diponivel = diponivel;
    }
    
          
    public boolean receberPessoa(double peso) {
        
        if (this.diponivel) {
         
            this.vagasDisponiveis--;
            this.cargaAtual += peso; 
            
            if(this.vagasDisponiveis ==0 || this.cargaAtual >= this.cargaLimite) {
                this.diponivel = false;
            }
            return true;
        }
        return false;
    }
    
}


package ExercicioVeiculoAbastecimento;

public class Veiculo {
    
    private static int sequencial = 0; 
    
    private int idVeiculo;
    private int capacidadeTanque;
    private double litrosNoTanque;
    private double kmLitroGasolina;
    private double kmLitroEtanol;
    private double autonomia;
    private char combustivel;
    

    public Veiculo(int capacidadeTanque, double kmLitroGasolina, double kmLitroEtanol) {
        this.idVeiculo = ++sequencial;
        this.capacidadeTanque = capacidadeTanque;
        this.litrosNoTanque = litrosNoTanque;
        this.kmLitroGasolina = kmLitroGasolina;
        this.kmLitroEtanol = kmLitroEtanol;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getLitrosNoTanque() {
        return litrosNoTanque;
    }

    public void setLitrosNoTanque(double litrosNoTanque) {
        this.litrosNoTanque = litrosNoTanque;
    }

    public double getKmLitroGasolina() {
        return kmLitroGasolina;
    }

    public void setKmLitroGasolina(double kmLitroGasolina) {
        this.kmLitroGasolina = kmLitroGasolina;
    }

    public double getKmLitroEtanol() {
        return kmLitroEtanol;
    }

    public void setKmLitroEtanol(double kmLitroEtanol) {
        this.kmLitroEtanol = kmLitroEtanol;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public char getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(char combustivel) {
        if (this.combustivel == 'G') {
            this.autonomia = this.litrosNoTanque / this.kmLitroGasolina;
        }
    }
    
   
    public boolean creditarAbastecimento (double litrosAbastecidos){
        if (litrosAbastecidos <= this.capacidadeTanque){
        return true;
        }
        else {
            System.out.println("Abastecimento não permitido");       
        }
        return false;
    }
    
    public double debitarConsumo (double kmPecorridos){         
           if (this.combustivel == 'G') {
               this.autonomia = kmPecorridos / this.litrosNoTanque;
           }
        return 0;
    }

    public String toString() {
        return "" + "\nO Id do Veiculo: " + idVeiculo
                  + "\nA capacidade total do tanque: " + capacidadeTanque + "l"
                  + "\nA autonomia de combustivel para a Gasolina: " + kmLitroGasolina + "Km/l"
                  + "\nA autonomia de combustivel para o Etanol: " + kmLitroEtanol + "Km/l";
    }
    
    
}

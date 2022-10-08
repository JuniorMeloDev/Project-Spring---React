package ExercicioVeiculoAbastecimento;

import java.util.Date;

public class Abastecimento {
    
    private static int sequencial = 0;

    private int idAbastecimento;
    private Date data;
    private double precoGasolina;
    private double precoEtanol;
    private double relacao;
    private char combMaisEconomico;
    private double litrosAbastecidos;
    private double valorAbastecimento;
    private double autonomiaAbastecimento;
    private Veiculo veiculo;
    

    public Abastecimento(int idAbastecimento, double precoGasolina, double precoEtanol, double relacao, char combMaisEconomico, double litrosAbastecidos, double valorAbastecimento, double autonomiaAbastecimento) {
        this.idAbastecimento = ++sequencial;
        this.precoGasolina = precoGasolina;
        this.precoEtanol = precoEtanol;
        this.relacao = relacao;
        this.combMaisEconomico = combMaisEconomico;
        this.litrosAbastecidos = litrosAbastecidos;
        this.valorAbastecimento = valorAbastecimento;
        this.autonomiaAbastecimento = autonomiaAbastecimento;
    }

    public int getIdAbastecimento() {
        return idAbastecimento;
    }

    public double getPrecoGasolina() {
        return precoGasolina;
    }

    public void setPrecoGasolina(double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public double getPrecoEtanol() {
        return precoEtanol;
    }

    public void setPrecoEtanol(double precoEtanol) {
        this.precoEtanol = precoEtanol;
    }

    public double getRelacao() {
        return relacao;
    }

    public void setRelacao(double relacao) {
        this.relacao = relacao;
    }

    public char getCombMaisEconomico() {
        return combMaisEconomico;
    }

    public void setCombMaisEconomico(char combMaisEconomico) {
        this.combMaisEconomico = combMaisEconomico;
    }

    public double getLitrosAbastecidos() {
        return litrosAbastecidos;
    }

    public void setLitrosAbastecidos(double litrosAbastecidos) {
        this.litrosAbastecidos = litrosAbastecidos;
    }

    public double getValorAbastecimento() {
        return valorAbastecimento;
    }

    public void setValorAbastecimento(double valorAbastecimento) {
        this.valorAbastecimento = valorAbastecimento;
    }

    public double getAutonomiaAbastecimento() {
        return autonomiaAbastecimento;
    }

    public void setAutonomiaAbastecimento(double autonomiaAbastecimento) {
        this.autonomiaAbastecimento = autonomiaAbastecimento;
    }
        
    private void calcularRelacao() {
        this.relacao = this.precoEtanol/this.precoGasolina;
        
    }
    
    public void obterCombustivelMaisEconomico(){
        if (this.relacao >=0.7) {
            this.combMaisEconomico = 'G';
        }
        else {
            this.combMaisEconomico = 'E';
        }
    }
    
    public void calcularValorAbastecimento() {
        if (this.combMaisEconomico =='G') {
            this.valorAbastecimento = this.precoGasolina * this.litrosAbastecidos;
        }
        else {
            this.valorAbastecimento = this.precoEtanol * this.litrosAbastecidos;
        }
    }
    
    public double calcularAutonomiaAbastecimento() {
        return this.autonomiaAbastecimento = veiculo.getLitrosNoTanque() + this.litrosAbastecidos * 0.10;
        
    }
}

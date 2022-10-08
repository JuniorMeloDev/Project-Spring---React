package ExercicioAeronave;

import java.util.Calendar;
import java.util.Date;

public class Aeronave {
    
    private int idAeronave;
    private String descricao;
    private Date dataManutencao;
    private Date proximaManutencao;
    private int frequenciaManutencao;
    private boolean manutencao; //true em manutenção e false operando
    private CompanhiaAerea companhiaAerea;
    private Modelo modelo;
    private Fabricante fabricante;

    public Aeronave(int idAeronave, String descricao, int frequenciaManutencao, boolean manutencao, CompanhiaAerea companhiaAerea, Modelo modelo, Fabricante fabricante) {
        this.idAeronave = idAeronave;
        this.descricao = descricao;
        this.frequenciaManutencao = frequenciaManutencao;
        this.manutencao = false;
        this.companhiaAerea = companhiaAerea;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public int getIdAeronave() {
        return idAeronave;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataManutencao() {
        return dataManutencao;
    }

    public void setDataManutencao(Date dataManutencao) {
        this.dataManutencao = dataManutencao;
    }

    public Date getProximaManutencao() {
        return proximaManutencao;
    }

    public void setProximaManutencao(Date proximaManutencao) {
        this.proximaManutencao = proximaManutencao;
    }

    public int getFrequenciaManutencao() {
        return frequenciaManutencao;
    }

    public void setFrequenciaManutencao(int frequenciaManutencao) {
        this.frequenciaManutencao = frequenciaManutencao;
    }

    public boolean getManutencao() {
        return manutencao;
    }

    public void setManutencao(boolean manutencao) {
        this.manutencao = manutencao;
    }

    public CompanhiaAerea getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(CompanhiaAerea companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    public void manutencaoEntrada(){
        this.manutencao = true;
    }
    
    public void manutencaoSaida (Date data) {
        this.manutencao = false;
        this.dataManutencao = Calendar.getInstance().getTime();     // getTime retorna um tipo Date
        Calendar cal = Calendar.getInstance(); // Criação da variavel 'cal' so para converter de Date para Calendar
        cal.setTime(data);
        cal.add(Calendar.MONTH, this.frequenciaManutencao);
        this.proximaManutencao = cal.getTime();
    }
    
    public void status() {
        System.out.println("---------------- Status da aeronave ----------------------\n ");
        System.out.println("Id da Aeronave: " + this.idAeronave);
        System.out.println("Descrição da Aeronave: " + this.descricao);
        System.out.println("Companhia Aérea: " + this.companhiaAerea.getRazaoSocial());
        System.out.println("Fabricante: " + this.fabricante.getNomeFantasia());
        System.out.println("Modelo: " + this.modelo.getSigla());
        System.out.println("Frequência de Manutenção: " + this.frequenciaManutencao + " " + "Meses");
}
    
        
        
}
    


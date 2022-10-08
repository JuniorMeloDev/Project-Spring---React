package Aula09;

import java.util.ArrayList;
import java.util.Date;


public class Carrinho {
    
    static private int sequencial = 0;
    
    private int id; 
    private Date data;
    private ArrayList<Produto> itens;
    private Produto produto;
    private int numDeItens;
    private double valorICMS;
    private double valorVenda;
    private String status;

    public Carrinho(Date data) {
        this.id = ++sequencial;
        this.data = data;
        this.valorVenda = valorVenda;
        this.status = "Pendente";
        this.itens = new ArrayList<Produto>();
       
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumDeItens() {
        return numDeItens;
    }

    public void setNumDeItens(int numDeItens) {
        this.numDeItens = numDeItens;
    }

    public double getValorICMS() {
        return valorICMS;
    }

    public void setValorICMS(double valorICMS) {
        this.valorICMS = valorICMS;
        
    }

    public double getValorVenda() {
       return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void insereItem (Produto p ) {
        this.itens.add(p);
        this.valorICMS += p.calcularICMS();
        this.valorVenda += p.getPrecoVenda();
    }
    
    public void confirmarCompra(){
        for (Produto produto: this.itens) {
            produto.confirmarVenda();
        }
        this.status = "Confirmada";
    }

    @Override
    public String toString() {
        return  "" + "\n Data = " + data
                   + "\n id = " + id
                   + "\n itens: " + itens 
                   + "\n numDeItens = " + itens.size()
                   + "\n valorICMS = " + valorICMS
                   + "\n valorVenda = " + valorVenda
                   + "\n status = " + status;
    }
    
    
}

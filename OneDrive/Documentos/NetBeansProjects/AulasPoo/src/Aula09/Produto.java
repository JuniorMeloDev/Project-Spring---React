package Aula09;

public class Produto {
      
    private int codigo;
    private String descricao;
    private double precoVenda;
    private double aliquotaICMS;
    private boolean vendido;

    public Produto(int codigo, String descricao, double precoVenda, double aliquotaICMS) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoVenda = precoVenda;
        this.aliquotaICMS = aliquotaICMS;
        this.vendido = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getAliquotaICMS() {
        return aliquotaICMS;
    }

    public void setAliquotaICMS(double aliquotaICMS) {
        this.aliquotaICMS = aliquotaICMS;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
    public double calcularICMS() {
        double valorICMS = this.aliquotaICMS * this.precoVenda;
        return valorICMS;
    }
    
    public void confirmarVenda(){
        this.vendido = true;   
    }

    @Override
    public String toString() {
        return ""  + "\ncodigo = " + codigo 
                   + "\ndescricao = " + descricao 
                   + "\nprecoVenda = " + precoVenda 
                   + "\naliquotaICMS = " + aliquotaICMS 
                   + "\nvendido = " + vendido
                   + "\n";
                          
    
}

   
}
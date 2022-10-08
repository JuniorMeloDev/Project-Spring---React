package ExercicioAgregação;

public class Desenvolvedor {
    
    private int idDesenvolvedor;
    private String nome;
    private double valorHora;
    private double receitaEmAberto;

    public Desenvolvedor(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }
    
    public Desenvolvedor(int idDesenvolvedor,String nome, double valorHora) {
        this.idDesenvolvedor = idDesenvolvedor;
        this.nome = nome;
        this.valorHora = valorHora;
        this.receitaEmAberto = receitaEmAberto;
    }

    public Desenvolvedor() {
        
    }

    public int getIdDesenvolvedor() {
        return idDesenvolvedor;
    }

    public void setIdDesenvolvedor(int idDesenvolvedor) {
        this.idDesenvolvedor = idDesenvolvedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getReceitaEmAberto() {
        return receitaEmAberto;
    }

    public void setReceitaEmAberto(double receitaEmAberto) {
        this.receitaEmAberto = receitaEmAberto;
    }
     
    public void creditarFuncionalidade(char tipo, int minutos, double valor) {
       
        if(tipo == 'D'){
            this.receitaEmAberto += this.valorHora * minutos/60 + valor * 0.02;
        }
        else if (tipo =='A'){ 
            this.receitaEmAberto += this.valorHora * minutos/60 + valor * 0.01;
        }
        else {
                
        }         
    }
    
    public boolean debitarPagamento(double valor) {
        
        if(valor < this.receitaEmAberto) {
            this.receitaEmAberto -=  valor;
            System.out.println("\n-------Pagamento realizado com sucesso-------");
            
            return true;
        }
            System.out.println("\n-------Pagamento não Realizado-------");
            return false;
    }

    public String toString() {
        return ""   +   "\nId Desenvolvedor: " + idDesenvolvedor
                    +   "\nNome: " + nome
                    +   "\nValor Hora: " + "R$" + String.format("%.2f", valorHora)
                    +   "\nReceita: " + "R$" + String.format("%.2f" , receitaEmAberto);
    } 
}

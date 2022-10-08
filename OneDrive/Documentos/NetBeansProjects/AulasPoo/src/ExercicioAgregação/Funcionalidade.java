package ExercicioAgregação;

public class Funcionalidade {
    
     
    private int idFuncionalidade;
    private String descricao;
    private int minutosParaImplementar;
    private double valor;
    private char tipo;
    private char status;
    private Desenvolvedor desenvolvedor;

    public Funcionalidade(String descricao, int minutosParaImplementar, double valor, char tipo) {
        this.descricao = descricao;
        this.minutosParaImplementar = minutosParaImplementar;
        this.valor = valor;
        this.tipo = tipo;
    }
        
    public Funcionalidade(int idFuncionalidade, String descricao, int minutosParaImplementar, double valor, char tipo) {
        this.idFuncionalidade = idFuncionalidade;
        this.descricao = descricao;
        this.minutosParaImplementar = minutosParaImplementar;
        this.valor = valor;
        this.tipo = tipo;
        this.status = 'P';
    }

    public Funcionalidade() {
        
    }

    public int getIdFuncionalidade() {
        return idFuncionalidade;
    }

    public void setIdFuncionalidade(int idFuncionalidade) {
        this.idFuncionalidade = idFuncionalidade;
    }
   
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public int getMinutosParaImplementar() {
        return minutosParaImplementar;
    }

    public void setMinutosParaImplementar(int minutosParaImplementar) {
        this.minutosParaImplementar = minutosParaImplementar;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    public void atribuirFuncionalidade (Desenvolvedor dev ) {
        this.desenvolvedor = dev;
        this.status = 'D';                
    }
    
    public void registrarConclusao() {
        this.status = 'C';
        
        desenvolvedor.creditarFuncionalidade(tipo, idFuncionalidade, valor);    
    }

    public String toString() {
        return ""   +   "\nId Funcionalidade: " + idFuncionalidade
                    +   "\nDescrição: " + descricao
                    +   "\nMinutos para Implementar: " + minutosParaImplementar + ":00"
                    +   "\nValor da Implementação: " + "R$" + String.format("%.2f", valor)
                    +   "\nStatus: " + status
                    +   "\nNome Desenvolvedor: " + desenvolvedor.getNome();
    }
        
    
    
}


package Aula10;

import java.util.ArrayList;

public class Revista {
    
    static private int sequencial = 0;
    
    private int codigo;
    private String titulo;
    private ArrayList <Edicao> edicoes;
    private int reciclagemProduzida;

    public Revista(String titulo) {
        this.codigo = sequencial++;
        this.titulo = titulo;
        this.edicoes = new ArrayList<Edicao>();
        this.reciclagemProduzida = reciclagemProduzida;
    }

        public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Edicao> getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(ArrayList<Edicao> edicoes) {
        this.edicoes = edicoes;
    }

    public int getReciclagemProduzida() {
        return reciclagemProduzida;
    }

    public void setReciclagemProduzida(int reciclagemProduzida) {
        this.reciclagemProduzida = reciclagemProduzida;
    }

    public void adicionarEdicao(Edicao ed){
        this.edicoes.add(ed);
        
    }
    
    public void removeEdicao (Edicao ed) {
          this.edicoes.remove(ed);
        
    }

    @Override
    public String toString() {
        return "" + "\nId da Revista: " + codigo
                  + "\nTitulo da Revista: " + titulo
                  + "\n"
                  + "\nEdição da Revista: " + edicoes
                  + "\n"
                  + "\nReciclagem produzia: " + reciclagemProduzida;
    }


    
}

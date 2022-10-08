
package ProvaPoo2;

public class Pessoa {
    
    private int idPessoa;
    private String nome;
    private double metaCaloriasDias;
    private double caloriasIngeridasManha;
    private double caloriasIngeridasTarde;
    private double caloriasIngeridasNoite;
    Alimento alimento;
    Consumo consumo;

    public Pessoa(int idPessoa, String nome, double metaCaloriasDias) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.metaCaloriasDias = metaCaloriasDias;
        this.caloriasIngeridasManha = 0;
        this.caloriasIngeridasTarde = 0;
        this.caloriasIngeridasNoite = 0;
        this.alimento = alimento;
        this.consumo = consumo;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMetaCaloriasDias() {
        return metaCaloriasDias;
    }

    public void setMetaCaloriasDias(double metaCaloriasDias) {
        this.metaCaloriasDias = metaCaloriasDias;
    }

    public double getCaloriasIngeridasManha() {
        return caloriasIngeridasManha;
    }

    public void setCaloriasIngeridasManha(double caloriasIngeridasManha) {
        this.caloriasIngeridasManha = caloriasIngeridasManha;
    }

    public double getCaloriasIngeridasTarde() {
        return caloriasIngeridasTarde;
    }

    public void setCaloriasIngeridasTarde(double caloriasIngeridasTarde) {
        this.caloriasIngeridasTarde = caloriasIngeridasTarde;
    }

    public double getCaloriasIngeridasNoite() {
        return caloriasIngeridasNoite;
    }

    public void setCaloriasIngeridasNoite(double caloriasIngeridasNoite) {
        this.caloriasIngeridasNoite = caloriasIngeridasNoite;
    }
    
    public void iniciarDia() {
        this.caloriasIngeridasManha = 0;
        this.caloriasIngeridasTarde = 0;
        this.caloriasIngeridasNoite = 0;
       
    
}
    
    public boolean registrarConsumo (int hora, double calorias) {
        
        if (hora <=12) {
            this.caloriasIngeridasManha = calorias;
            this.caloriasIngeridasManha+= calorias;
            if(this.caloriasIngeridasManha > metaCaloriasDias) {
               return true;
            }
        }
        else if (hora <= 18) {
            this.caloriasIngeridasTarde = calorias;
            this.caloriasIngeridasTarde += calorias;
            if(this.caloriasIngeridasTarde > metaCaloriasDias) {
                return true;
            }
        }
        else {
            this.caloriasIngeridasNoite = calorias;
            this.caloriasIngeridasNoite += calorias;
            if(this.caloriasIngeridasNoite > metaCaloriasDias) {
                return true;
            }
        }
        return false;
            
}

    @Override
    public String toString() {
        return "Pessoa\n"   + "\nidPessoa = " + idPessoa
                            + "\nnome = " + nome 
                            + "\nmetaCaloriasDias = " + metaCaloriasDias
                            + "\ncaloriasIngeridasManha = " + caloriasIngeridasManha
                            + "\ncaloriasIngeridasTarde = " + caloriasIngeridasTarde 
                            + "\ncaloriasIngeridasNoite = " + caloriasIngeridasNoite;
    }

    
    
}


package ExercicioDatas;

import java.util.Date;

public class Venda {
	   
    private int numero;
    private Date data;
    private float valorTotal;
	    
    public Venda(int numero, Date data, float valorTotal) {
        this.numero = numero;
	this.data = data;
	this.valorTotal = valorTotal;
	}
    
    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
	this.data = data;
    }

    public float getValorTotal() {
	return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
	this.valorTotal = valorTotal;
    }

		
	    
}
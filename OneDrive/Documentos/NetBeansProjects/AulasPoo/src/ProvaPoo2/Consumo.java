
package ProvaPoo2;

import java.util.Date;

public class Consumo {
    
    private int idConsumo;
    private Date data;
    private int hora;
   

    public Consumo(int idConsumo, Date data, int hora) {
        this.idConsumo = idConsumo;
        this.data = data;
        this.hora = hora;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
    
}

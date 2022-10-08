
package aula04;

public class Equipamento {
	
	private String descricao;
	private int temperatura;
	private boolean status;
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public int getTemperatura() {
		return this.temperatura;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void ligar() {
		this.status = true;
		this.temperatura = 80;
	}
	
	public void desligar() {
		this.status = false;
	}
	
	public void incrementar() {
		if (this.temperatura < 85 && this.status == true)  {
			this.temperatura += 1;			
		}
	}
	
	public void decrementar() {
		if (this.temperatura >80 && this.status == true) {
			this.temperatura -= 1;			
		}
	}

}
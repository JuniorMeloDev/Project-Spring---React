package ExercicioDatas;

public class Registradora {
    
        private int id;
	private Venda vendaCorrente;
	private Loja localizacao;
	   
	public Registradora(int id, Venda vendaCorrente, Loja localizacao) {
		this.id = id;
		this.vendaCorrente = vendaCorrente;
		this.localizacao = localizacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Venda getVendaCorrente() {
		return vendaCorrente;
	}

	public void setVendaCorrente(Venda vendaCorrente) {
		this.vendaCorrente = vendaCorrente;
	}

	public Loja getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Loja localizacao) {
		this.localizacao = localizacao;
	}
	
}
    


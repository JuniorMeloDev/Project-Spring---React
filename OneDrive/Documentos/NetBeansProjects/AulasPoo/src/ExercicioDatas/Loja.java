package ExercicioDatas;

public class Loja {
    
  	private int id;
	private String endereco;
	private String telefone;
	
	public Loja(int id, String endereco, String telefone) {
		this.id = id;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
    


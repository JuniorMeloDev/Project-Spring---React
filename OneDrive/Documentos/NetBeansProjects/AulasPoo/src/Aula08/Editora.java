
package Aula08;

public class Editora {
    
    private int idEditora;
    private String razaoSocial;
    private String contato;
    private String cidade;
    private String UF;
	
	
	public Editora(int idEditora, String razaoSocial, String contato, String cidade, String uF) {
	
		this.idEditora = idEditora;
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.cidade = cidade;
		UF = uF;
	}


	public int getIdEditora() {
		return idEditora;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUF() {
		return UF;
	}


	public void setUF(String uF) {
		UF = uF;
	}
	
	

    
}

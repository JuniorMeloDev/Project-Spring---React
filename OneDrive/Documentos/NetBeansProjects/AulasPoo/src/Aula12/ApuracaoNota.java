
package Aula12;

public class ApuracaoNota {
	
	private double nota1;
	private double nota2;
	private double nota3;
	protected double media;
	
	public ApuracaoNota(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = this.calculaMedia(this.nota1,  this.nota2, this.nota3);
	}
	
	public ApuracaoNota(double nota1, double nota2) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = this.calculaMedia(this.nota1, this.nota2);
	}


	public double calculaMedia(double n1, double n2) {
		return (n1 + n2) /2;
	}

	public double calculaMedia(double n1, double n2, double n3) {
		return (n1 + n2 + n3) /3;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return media;
	}
	
}
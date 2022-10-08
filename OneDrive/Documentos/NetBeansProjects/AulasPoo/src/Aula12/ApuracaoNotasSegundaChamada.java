/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula12;

public class ApuracaoNotasSegundaChamada extends ApuracaoNota {
	
	private double nota;

	public ApuracaoNotasSegundaChamada(double nota1, double nota2, double nota) {
		super(nota1, nota2);
		this.nota = nota;
		this.media = this.calculaMedia(nota1, nota2);
	}

	public ApuracaoNotasSegundaChamada(double nota1, double nota2, double nota3, double nota) {
		super(nota1, nota2, nota3);
		this.nota = nota;
		this.media = this.calculaMedia(nota1, nota2, nota3);
	}

	@Override
	public double calculaMedia(double n1, double n2) {
		double media = 0;
		if (n1 == 0) { // faltou a 1º prova ou a 2ª também (já que a 2ª chamada só substitiu uma das notas
			media =  (n2 + this.nota) / 2;
		}
		else {
			if (n2 == 0) { // faltou a 2º prova
				media =  (n1 + this.nota) / 2;
			}		
		}
		return media;
	}
	
	@Override
	public double calculaMedia(double n1, double n2, double n3) {
		double media = 0;
		if (n1 == 0) {
			media = (n2 + n3 + this.nota) / 3;
		}
		else {
			if (n2 == 0) {
				media = (n1 + n3 + this.nota) / 3;
			}
			else {
				media = (n1 + n2 + this.nota) / 3;
			}
		}
		return media;
	}
	
	

}
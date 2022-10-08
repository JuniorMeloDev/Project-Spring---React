/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula12;

import java.util.Scanner;

public class AppNotas {

	public static void main(String[] args) {

                Scanner ler = new Scanner(System.in);
                
                System.out.print("Digite a primeira nota: ");
                double nota1 = ler.nextDouble();
                
                System.out.print("Digite a segunda nota: ");
                double nota2 = ler.nextDouble();
                
                System.out.print("Digite a terceira nota: ");
                double nota3 = ler.nextDouble();
                
                System.out.print("Digite a quarta nota: ");
                double nota4 = ler.nextDouble();
                
		
		/* Cenario 1: sem segunda chamada		
		// Só duas notas
		System.out.println("Cenário 1: sem segunda chamada:");
		ApuracaoNota apNotas = new ApuracaoNota(nota1, nota2);
		System.out.println(apNotas.getMedia());

		// Três notas
		apNotas = new ApuracaoNota(nota1,nota2, nota3);
		System.out.println(apNotas.getMedia());
		*/
		
		 //Cenário 2: com segunda chamada
		// Só duas notas
		System.out.println("Cenário 2: com segunda chamada:");
		//ApuracaoNotasSegundaChamada apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3);
		//System.out.println(apNota2Ch.getMedia());

		//apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3);
		//System.out.println(apNota2Ch.getMedia());

		//apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3);
		//System.out.println(apNota2Ch.getMedia());

		// Três notas
		ApuracaoNotasSegundaChamada apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3, nota4);
		System.out.println(apNota2Ch.getMedia());
		
                /*
		apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3, nota4);
		System.out.println(apNota2Ch.getMedia());

		apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3, nota4);
		System.out.println(apNota2Ch.getMedia());
		
		apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3, nota4);
		System.out.println(apNota2Ch.getMedia());

		apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3, nota4);
		System.out.println(apNota2Ch.getMedia());

		apNota2Ch = new ApuracaoNotasSegundaChamada(nota1, nota2, nota3, nota4);
		System.out.println(apNota2Ch.getMedia());
                */
	}

}

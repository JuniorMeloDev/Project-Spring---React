
package Aula06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App03 {

	static List<Exame> exames = new ArrayList<Exame>();
	
	static Scanner lerTeclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar exame");
			System.out.println("2 - Consultar exame");
			System.out.println("3 - Listagem de exames");
			System.out.println("0 - Finalizar");
			
			try {
				System.out.print("\nOpção: ");
				opcao = lerTeclado.nextInt();							
			}
			catch (Exception e) {
				System.out.println("A opção deve ser numérica");
				lerTeclado.nextLine();
				continue;				
			}

    		switch (opcao) {
    		case 1:
    			incluirExame();
    			break;
    		case 2:
    			consultarExame();
    			break;
    		case 3:
    			listarExames();    			
    			break;
    		case 0:
			System.out.println("\n--- PROGRAMA FINALIZADO  ---");
			return;
    		default:
			System.out.println("\n--- Opção incorreta  ---");
			break;
    		}
		} while (true);


	}
	
	/*
	 * Nome: pesquisarExame
	 * Parametro de entrada: inteiro, representado o id do exame a ser pesquisado
	 * Saída (Exame):  null se o exame não for encontrado na lista
	 *                 Um objeeto do classe Exame se o id for encontrado na lista
	 */
	public static Exame pesquisarExame(int idExame) {

		for (Exame exame : exames ) {
			
			if (exame.getIdExame() == idExame) {
				return exame;
			}
		}
		return null;
	}
	
	public static void incluirExame() {

		System.out.println("\n*** Inserir Exame ***\n");
		System.out.print("Identificador   : ");
		int idExame = lerTeclado.nextInt();
		
		Exame exameEncontrado = pesquisarExame(idExame);
		
		if (exameEncontrado != null ) {
			System.out.println("Exame já cadastrado");
			return;
		}
		
		System.out.print("Tipo do exame   : ");
		lerTeclado.nextLine();
		String tipoExame = lerTeclado.nextLine();
		
		System.out.print("Nível de glicose: ");
		int nivelGlicose = lerTeclado.nextInt();
		
		Exame exameAux = new Exame(idExame, tipoExame, nivelGlicose);
		
		exames.add(exameAux);


		
	}
	
	public static void consultarExame() {
		if (exames.size() == 0) {
			System.out.println("===== Lista Vazia =====");
			return;
		}
		
		System.out.println("\n*** Consultar Exame ***\n");
		System.out.print("Identificador   : ");
		int idExame = lerTeclado.nextInt();
		
		Exame exameEncontrado = pesquisarExame(idExame);
		if (exameEncontrado == null) {
			System.out.println("Exame não cadastrado");
			return;
		}
		System.out.println(exameEncontrado.getTipoExame());
		System.out.println(exameEncontrado.getNivelGlicose());
		System.out.println(exameEncontrado.obterDiagnostico());

		
	}

	public static void listarExames() {
		if (exames.size() == 0) {
			System.out.println("===== Lista Vazia =====");
			return;
		}
		
		System.out.println("\n*** Listagem de Exames ***\n");   			
		
		for (Exame exame: exames) {
			System.out.println(exame.getIdExame() + " - " +
		                       exame.getTipoExame()+ " - " +
					           exame.getNivelGlicose() + " - " +
		                       exame.obterDiagnostico());
		}

	}


}
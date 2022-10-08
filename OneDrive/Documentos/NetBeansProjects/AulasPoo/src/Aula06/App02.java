package Aula06;

import java.util.Scanner;

public class App02 {
	
	static int TAMANHO_VETOR = 4;
	static Exame[] exames = new Exame[TAMANHO_VETOR];
	static int contExames = 0;
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
	 * Saída (inteiro):  -1 ser o exame não for encontrado no array
	 *                   indice do array onde o id foi encontrado
	 */
	public static int pesquisarExame(int idExame) {
		int achou = -1;
		for (int i = 0; i<contExames; i++) {
			
			if (exames[i].getIdExame() == idExame) {
				achou = i;
				break;
			}
		}
		return achou;
	}
	
	public static void incluirExame() {
		if (contExames == TAMANHO_VETOR) {
			System.out.println("===== Array cheio =====");
			return;
		}

		System.out.println("\n*** Inserir Exame ***\n");
		System.out.print("Identificador   : ");
		int idExame = lerTeclado.nextInt();
		
		
		int posicao = pesquisarExame(idExame);
		
		if (posicao != -1 ) {
			System.out.println("Exame já cadastrado");
			return;
		}
		
		System.out.print("Tipo do exame   : ");
		lerTeclado.nextLine();
		String tipoExame = lerTeclado.nextLine();
		
		System.out.print("Nível de glicose: ");
		int nivelGlicose = lerTeclado.nextInt();
		
		Exame exameAux = new Exame(idExame, tipoExame, nivelGlicose);
		
		exames[contExames] = exameAux;

		contExames++;
		
	}
	
	public static void consultarExame() {
		if (contExames == 0) {
			System.out.println("===== Array vazio =====");
			return;
		}
		
		System.out.println("\n*** Consultar Exame ***\n");
		System.out.print("Identificador   : ");
		int idExame = lerTeclado.nextInt();
		
		int posicao = pesquisarExame(idExame);
		if (posicao == -1) {
			System.out.println("Exame não cadastrado");
			return;
		}
		System.out.println(exames[posicao].getTipoExame());
		System.out.println(exames[posicao].getNivelGlicose());
		System.out.println(exames[posicao].obterDiagnostico());

		
	}

	public static void listarExames() {
		if (contExames == 0) {
			System.out.println("===== Array vazio =====");
			return;
		}
		
		System.out.println("\n*** Listagem de Exames ***\n");   			
		
		for (int i = 0; i<contExames ; i++) {
			System.out.println(exames[i].getIdExame() + " - " +
		                       exames[i].getTipoExame()+ " - " +
					           exames[i].getNivelGlicose() + " - " +
		                       exames[i].obterDiagnostico());
		}

	}
	
}

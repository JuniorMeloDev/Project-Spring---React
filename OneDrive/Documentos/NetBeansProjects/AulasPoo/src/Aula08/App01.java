
package Aula08;

import java.util.Scanner;

public class App01 {    
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a Editora: ");
        String editora = ler.nextLine();
        
        System.out.println("Digite o Genero: ");
        String genero = ler.nextLine();
        
        System.out.println("Digite o nome do livro: ");
        String livro = ler.nextLine();
        
        
        //Editora editora = new Editora(01, "Globo", "99999-9999", "Recife", "PE");
        Editora editora2 = new Editora(02, "Saraiva", "88888-9999", "Recife", "PE");
	//Genero genero = new Genero (100, "Romance");
	Genero genero2 = new Genero (200, "Comedia");
	Genero genero3 = new Genero (300, "Terror");
	//Livro livro = new Livro (11, "Volta para casa", "9922113355",200,editora, genero);
	Livro livro2 = new Livro (22, "Lost", "9922114466",300,editora2, genero3);
	Livro livro3 = new Livro (33, "Os Trapalhões", "9922115577",400,editora2, genero2);
	//Livro livro4 = new Livro (44, "Amor amor", "9922116688",500,editora, genero);
	//Livro livro5 = new Livro (55, "Ataque profundo", "9922117799",600,editora, genero);
		
		
	
	//System.out.println (livro.getTitulo() + " - " + livro.getEditora().getRazaoSocial() + " - " + livro.getGenero().getNomeGenero());
	//System.out.println (livro2.getTitulo() + " - " + livro2.getEditora().getRazaoSocial() + " - " + livro2.getGenero().getNomeGenero());
	//System.out.println (livro3.getTitulo()+ " - " + livro3.getEditora().getRazaoSocial()+ " - " + livro3.getGenero().getNomeGenero());
	//System.out.println (livro4.getTitulo() + " - " + livro4.getEditora().getRazaoSocial()+ " - " + livro4.getGenero().getNomeGenero());
	//System.out.println (livro5.getTitulo() + " - " + livro5.getEditora().getRazaoSocial()+ " - " + livro5.getGenero().getNomeGenero());
        System.out.println(livro);
    }
    
}

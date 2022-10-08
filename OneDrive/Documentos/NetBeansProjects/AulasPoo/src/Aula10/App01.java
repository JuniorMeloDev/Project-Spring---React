
package Aula10;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class App01 {

    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        
        Edicao edicoes = new Edicao(1, "01/05/2019", 200, 150, true);
              
        //System.out.println("Qual o id da Revista: ");
        //int idRevista = ler.nextInt();
        
        Revista revista = new Revista("Veja");
        revista.adicionarEdicao(edicoes);
        edicoes.qtdeReciclaveis();
        
        System.out.println(revista);
       
        
        
        
        
    }
    
}

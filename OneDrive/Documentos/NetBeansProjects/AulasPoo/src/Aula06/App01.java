package Aula06;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App01 {

    public static void main(String[] args) {
        //Scanner ler = new Scanner(System.in);
        
       
        //System.out.print("Digite o id do Exame: ");
        int idExame = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Exame"));
           
                
        //System.out.print("Digite o Nivel de Glicose: ");
        int nivelGlicose = Integer.parseInt(JOptionPane.showInputDialog("Digite o nivel de glicose"));

        //ler.nextLine();
        //System.out.print("Digite o tipo do exame: ");
        String tipoExame = JOptionPane.showInputDialog("Digite o tipo do exame");
        
        Exame exame = new Exame(idExame, tipoExame, nivelGlicose);
        
        /*System.out.println("\n **** Consulta ****\n");
        System.out.println("Identificador: " + exame.getIdExame());
        System.out.println("Tipo de exame: " + exame.getTipoExame());
        System.out.println("Nivel de Glicose: " + exame.getNivelGlicose());
        
        System.out.println("O resultado é: " + exame.obterDiagnostico());
        
*/
        JOptionPane.showMessageDialog(null,"Dados da Consulta: ");
        JOptionPane.showMessageDialog(null,"O identificador do exame: " 
                + exame.getIdExame());
        JOptionPane.showMessageDialog(null,"O tipo do exame: " 
                + exame.getTipoExame());
        JOptionPane.showMessageDialog(null,"O nivel de glicose: " 
                + exame.getNivelGlicose());
        
        
        
        
             
    }
    
}

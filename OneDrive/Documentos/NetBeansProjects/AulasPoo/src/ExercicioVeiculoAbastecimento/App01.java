
package ExercicioVeiculoAbastecimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App01 {
    
    static Scanner ler = new Scanner(System.in);
    

    public static void main(String[] args) {
        
        System.out.print("Qual a capacidade do tanque do veiculo(L): ");
        int capacidade = ler.nextInt();
        
        System.out.print("Qual a autonomia Km/l na gasolina: ");
        double kmLitroGasolina = ler.nextDouble();
        
        System.out.print("Qual a autonomia Km/l no Etanol: ");
        double kmLitroEtanol = ler.nextDouble();
        
        Veiculo veiculo = new Veiculo( capacidade, kmLitroGasolina, kmLitroEtanol);
        
        System.out.println(veiculo);
        
        List<Abastecimento> listaAbastecimento = new ArrayList<Abastecimento>();
        
        
        
        
        
        
        
        
        
        
        
        
        ler.close();
    }
    
}

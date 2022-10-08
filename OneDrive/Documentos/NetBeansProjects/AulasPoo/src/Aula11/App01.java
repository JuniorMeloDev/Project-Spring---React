 
package Aula11;

import java.util.ArrayList;
import java.util.List;

public class App01 {

    public static void main(String[] args) {
    
        List<NavioGraneleiro> lista = new ArrayList<NavioGraneleiro>();
        NavioGraneleiro navioGraneleiro = new NavioGraneleiro(10, "Estrela do Mar", 4, 50000f, 4);
        NavioGraneleiro navioGraneleiro2 = new NavioGraneleiro(25, "Cruzeiro do Sul", 3, 80000f, 6);
        lista.add(navioGraneleiro);
        lista.add(navioGraneleiro2);
        
        List<NavioContainer> lista2 = new ArrayList<NavioContainer>();
        NavioContainer navioContainer = new NavioContainer(33, "Bela Fera", 2, 100000f, 2, 30);
        NavioContainer navioContainer2 = new NavioContainer(48, "Arrecifes", 2, 120000f, 2, 30);
        NavioContainer navioContainer3 = new NavioContainer(52, "Águas Belas", 1, 90000f, 0, 25);
        lista2.add(navioContainer);
        lista2.add(navioContainer2);
        lista2.add(navioContainer3);
        
        System.out.println(navioContainer.getDisponibilidade());
        System.out.println(navioContainer.getNome());
        
        navioContainer.iniciaCarregamento();
        System.out.println(navioContainer.getDisponibilidade());
        
        navioContainer.bloqueiaCarregamento();
        System.out.println(navioContainer.getDisponibilidade());
        
        System.out.println(navioContainer);
        
    }
   
}
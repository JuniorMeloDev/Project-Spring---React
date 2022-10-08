package ProvaPoo;

import ProvaPoo.Elevador;
import java.util.Scanner;

public class App02 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        //System.out.println("Qual é a capacidade maxima de pessoas no Elevador? ");
        //int vagasTotais = ler.nextInt();
               
        //System.out.println("Há quantas pessoas no Elevador? ");
        //int pessoasNoElevador = ler.nextInt();
        
        System.out.println("Há quantas vagas no Elevador disponiveis? ");
        int vagasDisponiveis = ler.nextInt();
        
        System.out.println("Qual é a carga atual de peso kg? ");
        double cargaAtual = ler.nextDouble();
        
        System.out.println("Qual é a carga maxima de peso kg? ");
        double cargaLimite = ler.nextDouble();
        
        
        
       
                     
        Elevador elevador = new Elevador(1, vagasDisponiveis, cargaLimite, cargaAtual, true);
        
        elevador.receberPessoa(peso);
                
        
        
    }
    
}

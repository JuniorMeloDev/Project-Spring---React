package ExercicioAeronave;

import java.util.Calendar;
      
public class App01 {

    public static void main(String[] args) {
          
    CompanhiaAerea companhiaAerea = new CompanhiaAerea(01, "Azul");
    
    Modelo modelo = new Modelo(01, "737", 400, 1200);
    
    Fabricante fabricante = new Fabricante (100, "Boeing", "Brasileira", 21.2);
    
    
    Aeronave aeronave = new Aeronave(01,"Aeronave de Grande Porte", 6, false, companhiaAerea, modelo, fabricante);
            
        aeronave.manutencaoEntrada();
 
        System.out.println("A aeronave está em manutenção? " + aeronave.getManutencao());
        System.out.println("----------------------------------------------------------");
      
        aeronave.manutencaoSaida(Calendar.getInstance().getTime());
        System.out.println("A aeronave está em manutenção? " + aeronave.getManutencao());
        System.out.println("A data da manutenção: " + aeronave.getDataManutencao());
        System.out.println("A data da proxima manutenção: " + aeronave.getProximaManutencao());
        System.out.println(" ");

        aeronave.status();
        
        aeronave.getFabricante().atualizarAcoes(20);
        
        System.out.println(" ");
        
        aeronave.getFabricante().status();
         
                      
    }
    
}               

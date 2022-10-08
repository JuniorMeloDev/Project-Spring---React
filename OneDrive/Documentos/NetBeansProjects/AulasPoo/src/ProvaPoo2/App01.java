
package ProvaPoo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App01 {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = data.parse("13/06/2022");
        
        Alimento alimento = new Alimento(1, "Pizza", 200.0);
        Alimento alimento2 = new Alimento(2, "Sushi", 180.0);
        Alimento alimento3 = new Alimento(3, "Sopa", 120.0);
        
        Pessoa pessoa = new Pessoa(1, "ju", 500.0);
        
        Consumo consumoManha = new Consumo(1, dataFormatada, 8);
        Consumo consumoTarde = new Consumo(2, dataFormatada, 13);
        Consumo consumoNoite = new Consumo(3, dataFormatada, 19);
        
        pessoa.registrarConsumo(20, 200);
        pessoa.registrarConsumo(8, 100);
        
        System.out.println(pessoa);
        
        pessoa.iniciarDia();
        
        pessoa.registrarConsumo(8, 500);
        
        Date x1 = data.parse("09/05/2022");
        Date x2 = data.parse("10/05/2022");
        Date x3 = data.parse("11/05/2022");
        Date x4 = data.parse("12/05/2022");
        Date x5 = data.parse("13/05/2022");
        Date x6 = data.parse("14/05/2022");
        Date x7 = data.parse("15/05/2022");
        
        
       Consumo consumo = new Consumo(4, x1, 9);
       Consumo consumo2 = new Consumo(5, x2, 10);
       Consumo consumo3 = new Consumo(6, x3, 11);
       Consumo consumo4 = new Consumo(7, x4, 15);
       Consumo consumo5 = new Consumo(8, x5, 16);
       Consumo consumo6 = new Consumo(9, x6, 20);
       Consumo consumo7 = new Consumo(10, x7, 21);
        
        
        
         System.out.println(pessoa);
        
    
    }
    
}

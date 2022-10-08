package ExercicioDatas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class App01 {

    public static void main(String[] args) throws ParseException {
        
        //Scanner lerTeclado = new Scanner(System.in);
       
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
	Loja loja = new Loja(1, "Rua Imperial, 100 - Recife - PE", "81-3010-2020");
        
        //System.out.println("Digite a data do registro: ");
        //String dataString = lerTeclado.nextLine();

	//Date data = formato.parse(dataString); // Converte de String para data		
		
	Venda vendaCorrente = new Venda(1, new Date(), 1250.00f);

	Registradora caixa = new Registradora(10, vendaCorrente, loja);
        
        System.out.printf("Data do registro: " + vendaCorrente.getData());
		
	System.out.printf("\nNúmero do registro: %d",caixa.getId());

	System.out.printf("\nEndereço..........: %s",caixa.getLocalizacao().getEndereco()   );
		
	System.out.printf("\nValor da venda R$.: %.2f", caixa.getVendaCorrente().getValorTotal());
	
    }

   
    
}

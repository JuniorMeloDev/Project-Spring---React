
package aula04;

public class App01 {

    static Equipamento equipamento = new Equipamento();
	
    public static void main(String[] args) {
		
	equipamento.setDescricao("Equipamento para regular a temperatura") ;
		
	equipamento.ligar();
	
	for (int i = 0; i<3; i++) {
                equipamento.incrementar();
	}
		
	for (int i = 0; i<5; i++) {
        	equipamento.decrementar();			
	}
	
	mostrarTemperatura();


	for (int i = 0; i<2; i++) {
		equipamento.incrementar();
	}


	mostrarTemperatura();
	
	for (int i = 0; i<8; i++) {
		equipamento.incrementar();
	}

	for (int i = 0; i<2; i++) {
		equipamento.decrementar();			
	}
		
		equipamento.desligar();
		

		mostrarTemperatura();	
	}

	public static void mostrarTemperatura() {
            if (equipamento.getStatus() == true) {
			
                System.out.println("Descrição  : " + equipamento.getDescricao());
                System.out.println("Temperatura: " + equipamento.getTemperatura());
                System.out.println("Status     : " + equipamento.getStatus());			
	}
       	    else {
        	System.out.println("Equipamento desligado");
	}		
	}
}
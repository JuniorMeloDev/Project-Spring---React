package Aula09;

import java.util.Date;

public class App01 {

    public static void main(String[] args) {
                    
        Produto produto = new Produto(10,"Pneu", 300, 0.10);
        Produto produto2 = new Produto(20,"calota", 37, 0.10);
        Produto produto3 = new Produto(30,"Roda", 450, 0.10);

        Carrinho carrinho = new Carrinho(new Date());

        if (produto.isVendido()== true) {
            System.out.println("ERRO! Este produto ja foi vendido!");    
        } 

        else if (carrinho.getNumDeItens() == 0) {
            System.out.println("\nCarrinho criado com sucesso!");
            carrinho.insereItem(produto);
            produto.calcularICMS();
            //produto.confirmarVenda(); inserido no carrinho como pendente
            produto.confirmarVenda();
        }

        if (produto2.isVendido()== true) {
            System.out.println("ERRO! Este produto ja foi vendido!\n");
        }

        else {
            carrinho.insereItem(produto2);
            produto2.calcularICMS();
            //produto2.confirmarVenda();
        }

        if (produto3.isVendido()== true) {
            System.out.println("ERRO! Este produto ja foi vendido!\n");
    }
      
    else {
        carrinho.insereItem(produto3);
        produto3.calcularICMS();
        produto3.confirmarVenda();
    }
       //System.out.println(carrinho.toString()); mostra o status de pendente do carrinho e produto nao vendido
        carrinho.confirmarCompra();
        System.out.println(carrinho.toString());

    }
    
}

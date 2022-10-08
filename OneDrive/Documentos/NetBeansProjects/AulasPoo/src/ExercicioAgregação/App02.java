package ExercicioAgregação;

import java.util.ArrayList;
import java.util.Scanner;

public class App02 {
    
    static ArrayList<Desenvolvedor> lista = new ArrayList<>();
    static ArrayList <Funcionalidade> listaFunc = new ArrayList<>();
    static Scanner lerTeclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcao = 0;
        do {
            System.out.println("\n*** Seletor de Opções ***");
            System.out.println();
            System.out.println("1 - Cadastrar Desenvolvedor");
            System.out.println("2 - Consultar Desenvolvedor");
            System.out.println("3 - Cadastrar Funcionalidade");
            System.out.println("4 - Consultar Funcionalidade");
            System.out.println("5 - Atribuir Desenvolvedor");
            System.out.println("6 - Registrar Conclusão");
            System.out.println("7 - Registrar Pagamento");
            System.out.println("0 - Finalizar");

            try {
                System.out.print("\nOpção: ");
                opcao = lerTeclado.nextInt();
            } catch (Exception e) {
                System.out.println("A opção deve ser numérica");
                lerTeclado.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    incluirDesenvolvedor();
                    break;
                case 2:
                    consultarDesenvolvedor();
                    break;
                case 3:
                    incluirFuncionalidade();
                    break;
                case 4:
                    consultarFuncionalidade();
                    break;
                case 5:
                    atribuirDesenvolvedor();
                    break;
                case 6:
                    registrarConclusao();
                    break;
                case 7:
                    registrarPagamento();
                    break;
                case 0:
                    System.out.println("\n--- PROGRAMA FINALIZADO  ---");
                    return;
                default:
                    System.out.println("\n--- Opção incorreta  ---");
                    break;
            }
        } while (true);
    }

    public static Desenvolvedor pesquisarPorId(int id) {
        for (Desenvolvedor desenvolvedor : lista) {
            if (desenvolvedor.getIdDesenvolvedor()== id) {
                return desenvolvedor;
            }
        }
        return null;
    }
    
    public static Funcionalidade pesquisarPorId2(int id) {
        for (Funcionalidade funcionalidade : listaFunc) {
            if (funcionalidade.getIdFuncionalidade()== id) {
                return funcionalidade;
            }
        }
        return null;
    }

    public static void incluirDesenvolvedor() {
        System.out.print("ID: ");
        int id = lerTeclado.nextInt();

        if (pesquisarPorId(id) != null) {
            System.out.println("\n-------Desenvolvedor já cadastrado-------");
            return;
        }
        lerTeclado.nextLine();
        System.out.print("Nome: ");
        String nome = lerTeclado.nextLine();
        
        System.out.print("Valor da Hora Trabalhada: ");
        double valorHora = lerTeclado.nextDouble();

        Desenvolvedor desenvolvedor = new Desenvolvedor(id, nome, valorHora);

        lista.add(desenvolvedor);
        System.out.println("\n-------Desenvolvedor atribuido com sucesso-------");
    }
    
    public static void incluirFuncionalidade() {
        System.out.print("ID: ");
        int id = lerTeclado.nextInt();

        if (pesquisarPorId2(id) != null) {
            System.out.println("\n-------Funcionalidade já cadastrado-------");
            return;
        }
        lerTeclado.nextLine();
        System.out.print("Descrição: ");
        String descricao = lerTeclado.nextLine();
        
        System.out.print("Minutos para Implementar: ");
        int minutosParaImplementar = lerTeclado.nextInt();
                
        System.out.print("Valor para Implementar: ");
        double valorHora = lerTeclado.nextDouble();
        
        lerTeclado.nextLine();
        System.out.print("Status da Implementação (D, A , C): ");
        char status = lerTeclado.nextLine().charAt(0);
        status = Character.toUpperCase(status);
          
        Funcionalidade funcionalidade = new Funcionalidade(id, descricao, minutosParaImplementar, valorHora, status);
        
        listaFunc.add(funcionalidade);
        System.out.println("\n-------Funcionalidade atribuida com sucesso-------");
    }

    public static void consultarDesenvolvedor() {
        System.out.print("ID: ");
        int id = lerTeclado.nextInt();

        Desenvolvedor desenvolvedorEncontrado = pesquisarPorId(id);

        if (desenvolvedorEncontrado == null) {
            System.out.println("\n-------Desenvolvedor não cadastrado-------");
            return;
        }
        System.out.println(desenvolvedorEncontrado);

        //System.out.println(lista);    
    }

    public static void consultarFuncionalidade() {
        System.out.print("ID: ");
        int id = lerTeclado.nextInt();

        Funcionalidade funcionalidadeEncontrada = pesquisarPorId2(id);

        if (funcionalidadeEncontrada == null) {
            System.out.println("\nFuncionalidade não cadastrada");
            return;
        }

        System.out.println(funcionalidadeEncontrada);
    }

    public static void atribuirDesenvolvedor() {
        System.out.print("ID do Desenvolvedor: ");
        int id = lerTeclado.nextInt();

        Desenvolvedor desenvolvedorEncontrado = pesquisarPorId(id);
        
        System.out.print("ID da Funcionalidade: ");
        int idFunc = lerTeclado.nextInt();
        
        Funcionalidade funcionalidadeEncontrada = pesquisarPorId2(idFunc);

        if (desenvolvedorEncontrado == null && funcionalidadeEncontrada == null) {
            System.out.println("\n-------Desenvolvedor e funcionalidade não cadastrados--------");
            return;
        }
       funcionalidadeEncontrada.atribuirFuncionalidade(desenvolvedorEncontrado);
        System.out.println("\n-------Desenvolvedor atribuido com sucesso-------");
    }

    public static void registrarConclusao() {
        System.out.print("ID da Funcionalidade: ");
        int id = lerTeclado.nextInt();

        Funcionalidade funcionalidadeEncontrada = pesquisarPorId2(id);

        if (funcionalidadeEncontrada == null) {
            System.out.println("\n-------Funcionalidade não cadastrado--------");
            return;
        }
        funcionalidadeEncontrada.registrarConclusao();
        
        System.out.print("\n-------Conclusão Registrada com Sucesso-------\n ");
        funcionalidadeEncontrada.registrarConclusao();
    }
    
    public static void registrarPagamento() {
        System.out.print("ID do Desenvolvedor: ");
        int id = lerTeclado.nextInt();
        
        System.out.print("Valor retirada: ");
        double valorRetirada = lerTeclado.nextDouble();

        Desenvolvedor desenvolvedorEncontrado = pesquisarPorId(id);

        if (desenvolvedorEncontrado == null) {
            System.out.println("Desenvolvedor não cadastrado");
            return;
        }
        
        desenvolvedorEncontrado.debitarPagamento(valorRetirada);
                   
    }
    
}



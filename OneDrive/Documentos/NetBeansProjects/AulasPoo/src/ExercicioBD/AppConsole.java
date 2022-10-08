package ExercicioBD;

import java.util.Scanner;

import java.util.List;

public class AppConsole {

    static BancoDados bd = new BancoDados();

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;
        Usuario us = null;
        do {
            System.out.println("\n*** Seletor de Opções ***");
            System.out.println();
            System.out.println("1 - Inserir usuário");
            System.out.println("2 - Consultar usuário");
            System.out.println("3 - Consultar todos usuários");
            System.out.println("4 - Alterar usuário");
            System.out.println("5 - Excluir usuário");
            System.out.println("0 - Finalizar");

            try {
                System.out.print("\nOpção: ");
                opcao = ler.nextInt();
            } catch (Exception e) {
                System.out.println("\nA opção deve ser numérica");
                ler.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    inserirUsuario();
                    break;
                case 2:
                    consultarUsuario();
                    break;
                case 3:
                    listarTodosUsuarios();
                    break;
                case 4:
                    alterarUsuario();
                    break;
                case 5:
                    excluirUsuario();
                    break;
                case 0:
                    break;
                default:
                    System.out.printf("\nOpção incorreta!!!\n");
            }
            if (opcao == 0) {
                System.out.println("\n--- PROGRAMA FINALIZADO  ---");
                break;
            }
        } while (true);

    }

    public static void inserirUsuario() {
        ler.nextLine();
        System.out.println("Nome do usuario: ");
        String nome = ler.nextLine();
        System.out.println("e-Mail do usuario: ");
        String email = ler.nextLine();

        Usuario us = new Usuario(nome, email);

        System.out.println(bd.inserirUsuario(us));

    }

    public static void consultarUsuario() {
        System.out.println("Id para consultar: ");
        int id = ler.nextInt();
        Usuario us = bd.consultarUsuario(id);

        if (us == null) {
            System.out.println("\nUsuário não encontrado\n");
        } else if (us.getId() != 0) {
            System.out.printf("\nID....: %d", us.getId());
            System.out.printf("\nNome..: %s", us.getNome());
            System.out.printf("\nEmail..:%s ", us.getEmail());
            System.out.printf("\n-----------------------------------------\n");
        } else {
            // o objeto retornado traz a mensagem de erro no atributo nome
            System.out.println("\nErro: " + us.getNome());
        }

    }

    public static void listarTodosUsuarios() {
        try {

            List<Usuario> usuarios = bd.listarTodosUsuario();

            System.out.printf("\n         Lista de Usuários");
            System.out.printf("\n----------------------------------------------------------");
            System.out.printf("\nID -   Nome                   Email");
            System.out.printf("\n----------------------------------------------------------");
            for (Usuario usuario : usuarios) {

                int id = usuario.getId();
                String nome = usuario.getNome();
                String email = usuario.getEmail();
                System.out.printf("\n%4d - %-20s - %-20s", id, nome, email);
            }
            System.out.printf("\n--------------------------------------------------------\n");
        } catch (Exception erro) {
            System.out.printf("\nErro " + erro.getMessage());
        }

    }

    public static void alterarUsuario() {
        System.out.println("Id para alterar: ");
        int id = ler.nextInt();

        Usuario us = bd.pesquisarUsuario(id);

        if (bd.pesquisarUsuario(id) == null) {
            System.out.println("\nUsuário não encontrado\n");
            return;
        }

        ler.nextLine();
        System.out.println("Nome do usuario: ");
        String nome = ler.nextLine();
        System.out.println("e-Mail do usuario: ");
        String email = ler.nextLine();

        us = new Usuario(id, nome, email);
        System.out.println(bd.alterarUsuario(us));

    }

    public static void excluirUsuario() {
        System.out.println("Id para excluir: ");
        int id = ler.nextInt();
        System.out.println(bd.excluirUsuario(id));
    }
}

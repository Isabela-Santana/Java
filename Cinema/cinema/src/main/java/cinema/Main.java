package cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Cadastro de Usuários ---");
        System.out.println("Escolha o tipo de conta: [1] Gerente | [2] Vendedor | [3] Atendente");
        int opcao = leitor.nextInt();
        leitor.nextLine(); 
        System.out.print("Digite o Nome: ");
        String nome = leitor.nextLine();

        System.out.print("Digite o E-mail: ");
        String email = leitor.nextLine();

        System.out.print("Digite a Senha: ");
        String senha = leitor.nextLine();

        Usuario user = null;

        switch (opcao) {
            case 1:
                user = new Gerente(nome, email, senha);
                System.out.println("\nGerente criado com sucesso!");
                break;
            case 2:
                user = new Vendedor(nome, email, senha);
                System.out.println("\nVendedor criado com sucesso!");
                break;
            case 3:
                user = new Atendente(nome, email, senha);
                System.out.println("\nAtendente criado com sucesso!");
                break;
            default:
                System.out.println("Opção inválida!");
                return; 
        }

        
        System.out.println("\n--- Resumo do Perfil ---");
        System.out.println("Nome: " + user.getNome());
        System.out.println("Administrador: " + (user.isAdministrador() ? "Sim" : "Não"));
        
        user.realizarLogin();

        leitor.close();
    }
}
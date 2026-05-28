package contabancaria; 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do deposito inicial:");
        double inicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(inicial);

        conta.consultarSaldo();
        
        System.out.println("\nDigite o valor de um boleto:");
        double boleto = scanner.nextDouble();
        conta.realizarPagamento(boleto, "Boleto");

        conta.verificarChequeEspecial();
        conta.consultarSaldo();

        scanner.close();
    }
}
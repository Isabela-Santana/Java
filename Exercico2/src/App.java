import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        /*System.out.println("Informe um número para saber a tabuada:");
        int number = scanner.nextInt();
        System.out.println("\n ***  Tabuada de" + number + "***");

        for(int i = 0; i<=10; i++){
            int resultado = number * i;
            System.out.println(number + "x" + i + "="  + resultado);
        }*/







    /*System.out.println("Vamos decobrir o seu IMC( indice de massa corporea");
    System.out.println("Informe a sua altura em metros:");
    double high = scanner.nextDouble();
    System.out.println("Informe o seu peso em Kg:");
    double weigth = scanner.nextDouble();

    double imc = weigth/ (high*high);

    if (imc<18.5){
        System.out.println("Classificação: Abaixo do peso.");
    }else if (imc>=18.5 && imc < 25){
        System.out.println("classificação: Peso normal");
    }else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }*/

    /*System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        int n2;
        do {
            System.out.print("Digite o segundo número (deve ser maior que " + n1 + "): ");
            n2 = scanner.nextInt();
            if (n2 <= n1) {
                System.out.println("Erro! O segundo número precisa ser maior.");
            }
        } while (n2 <= n1);

        System.out.println("\nO que você deseja listar?");
        System.out.println("1 - Pares");
        System.out.println("2 - Ímpares");
        int opcao = scanner.nextInt();

        System.out.println("\nResultados em ordem decrescente:");

        
        for (int i = n2; i >= n1; i--) {
            
            if (opcao == 1) { 
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            } else if (opcao == 2) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }*/
       
    System.out.print("Informe o número inicial (divisor): ");
        int numeroInicial = scanner.nextInt();

        boolean continuar = true;


        while (continuar) {
            System.out.print("Informe um número N: ");
            int n = scanner.nextInt();

            // Regra 1: 
            if (n > numeroInicial) {
                System.out.println("-> Número maior que o inicial. Ignorado.");
                continue; 
            }

            
            if (n % numeroInicial != 0) {
                System.out.println("-> O resto de " + n + " / " + numeroInicial + " não é zero. Encerrando...");
                continuar = false; 
            } else {
                System.out.println("-> Divisão exata! O programa continua.");
            }
        }

        System.out.println("Programa finalizado.");        

    }
}

import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        var baseYear = OffsetDateTime.now().getYear();
        System.out.println("Olá, está um ótimo dia hoje, precisarei de algumas informações suas!");
        System.out.println("Infome o seu nome:");
        String name = scanner.next();
        System.out.println("Informe o ano do seu nascimento:");
        int year = scanner.nextInt();
        var age = baseYear - year;
        System.out.println("Informe o seu país de origem:");
        String country = scanner.next();
        System.out.printf("Olá %s sua idade é %s anos e você nasceu no(a) %s. \n", name, age, country);
        System.out.println("Agora vamos descobrir como calcular a área de um Quadrado!");
        System.out.println("A área de um quadrado é o resultado do Lado x Altura, tendo em vista que todos os lados do quadrado são iguais.");
        System.out.println("Informe um número para descobrirmos a área do quadrado:");
        int area = scanner.nextInt();
        var areas = area*area;
        System.out.printf("A área do quadrado é %s\n", areas);
        System.out.println("Agora vamos descobrir a área de um retangulo que é achada pela multiplicação da altura e da base.");
        System.out.println("Infome a altura do retangulo:");
        int height = scanner.nextInt();
        System.out.println("Infome a base do retangulo:");
        int base = scanner.nextInt();
        var arearet = height * base;
        System.out.printf("A área do retangulo é %s.\n", arearet);
        System.out.println("Agora informe o nome de duas pessoas:");
        String name1 = scanner.next();
        String name2 = scanner.next();
        System.out.println("Informe a idade dessas pessoas para que possamos achar a diferença de indade entre elas:");
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        var diferencaDeIdade = age1 -age2;
        System.out.printf("A diferença entre as idades é de: %s ano(s)\n", diferencaDeIdade);

    }
}

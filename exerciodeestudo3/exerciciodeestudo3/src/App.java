import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*var scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        var name = scanner.next();
        System.out.println("Informe a sua idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");


        if(age >=18) {

            System.out.printf("%s, você tem %s anos e pode dirigir\n ",name, age);
        } else if (age >= 16 && isEmancipated){
            System.out.printf("%s, apesar de você ter %s, você pode dirigir\n", name,age);
        } else {
            System.out.printf("%s, você não pode dirigir\n",name);
        }

        System.out.println("Fim da execução.");
    */
    /* var scanner = new Scanner(System.in);
    System.out.println("Informe um número de 1 até 7");
    var option = scanner.nextInt();
    
    var message = switch (option) {
        case 1, 7 -> {
            var day = option == 1 ? "Domingo" : "Sábado";
            yield String.format("Hoje é %s, fim de s2emana!",day);
        }
        case 2 -> "Segunda";
        case 3 -> "Terça";
        case 4 -> "Quarta";
        case 5 -> "Quinta";
        case 6 -> "Sexta";
        default -> "Opção inválida";

        };
        System.out.println(message);*/

    var scanner = new Scanner(System.in);

    /*for(;;){
        System.out.println("Digite um nome:");
        var name = scanner.next();

        if(name.equalsIgnoreCase("exit")) break;

        System.out.println(name);
    }*/

    /*for(var i = 0; i <=100;i++){
        if( i % 2 == 0) {
            continue;          
    }
    System.out.println(i);

    }*/

    var i =0;

    while(args.length >i) {
        System.out.println(args[1]);
        i++;
    }

    i=0;

    do{
        System.out.println(args[i]);
        i++;
    }while(args.length > i);


    //var name ="";
    /*do {
        System.out.println("Infome um nome:");
        name =scanner.next();
        System.out.println(name);    
        
        //if (name.equalsIgnoreCase("exit")) break;
    } while(!name.equalsIgnoreCase("exit"));*/

    /*while (!name.equals("exit")){
        System.out.println("Infome um nome:");
        name =scanner.next();
        System.out.println(name);   */



}
}
/* case 1:
        case 2:
            System.out.println("Fim de semana");
            break;
       
        case 3:
            System.out.println("Segunda");
            break;
        case 4: 
            System.out.println("Terça");
            break;
        case 5: 
            System.out.println("Quarta");
            break;
        case 6:
            System.out.println("Quinta");
            break;
        case 7:
            System.out.println("Sexta");
            break;
        default:
            System.out.println("Opção invalida!");*/
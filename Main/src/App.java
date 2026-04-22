import java.util.Scanner;

public class App {

   private final static String WELCOME_MESSAGE ="Olá, informe o seu nome";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
      //System.out.println("Olá, informe o seu nome");
        String name = scanner.next();
        System.out.println("Informe a sua idade:");
        int age = scanner.nextInt();
        System.out.println("Onde você mora:");
        String place = scanner.next();
        System.out.println("País que você vive:");
        String country = scanner.next();
        //System.err.println("olá" + name + "sua idade é" + age);
        System.out.printf("olá %s sua idade é %s mora em %s país que vive", name, age, place,country );
        
    }
}

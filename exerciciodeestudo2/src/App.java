import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //var scanner = new Scanner ( System.in);
       //System.out.println("Quantos anos vocÊ tem?");
       //var age = scanner.nextInt();
       //System.out.println("Você é emancipado?");
       //var isEmancipated =  scanner.nextBoolean();
       //var canDrive = age >= 18 || isEmancipated && age >= 16;
       //System.out.printf("Você pode dirigir? (%s) \n", canDrive);

       /*System.out.printf("true && true = %s \n", true && true);
       System.out.printf("false && false = %s \n", false && false);
       System.out.printf("true && false = %s \n", true && false);
       System.out.printf("false && true = %s \n", false && true);
       System.out.println("############################################");
       System.out.printf("true || true = %s \n", true || true);
       System.out.printf("false || false = %s \n", false || false);
       System.out.printf("true || false = %s \n", true || false);
       System.out.printf("false || true = %s \n", false || false);
       System.out.println("############################################");
       System.out.printf("!true = %s \n", !true);
       System.out.printf("!false = %s \n", !false);*/

       /*var value = 50;
       System.out.println(value++);
       System.out.println(value);*/

        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 5;
        //var binary2 = Integer.toBinaryString(value2);
        //System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
        //var result = value1 ^ value2;
        //var binaryResult = Integer.toBinaryString(result);
        //System.out.printf("%s ^ %s (representação binária %s)\n ", value1,value2,binaryResult);
        /*var result = -value1;
        var binaryResult = Integer.toBinaryString(result);*/
        var result = value1 << value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s << %s = %s (representação binária %s)\n ", value1,value2,result,binaryResult);
        
    }
}

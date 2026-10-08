
import java.util.Sanner; 

public class SentencialIfElse {
    public static void main(String[] args){
        Scanner imput = new Scanner (System.in);
        System.out.println("Introduce tu edad:");
        int age = imput.nextInt();

        if (age >= 65) {
            System.out.println("Usted esta jubilado");
        }else if (age >= 18) {
            System.out.println("Usted es mayor de edad");
        }else {
            System.out.println("Usted es menor de edad");
        }
    }
}

import java.util.Scanner;

/**
 *
 * @author Usuario1
 */
public class Switch {
    public static void main(String[] args){
    
        Scanner imput = new Scanner (System.in);
        System.out.println("Introduce el numero:");
        int numero = imput.nextInt ();

        switch (numero)
                {
                    case 1: 
                    System.out.println("Lunes") ;
                    break;

                    case 2:
                    System.out.println("Martes") ;
                    break;

                    case 3:
                    System.out.println("Miercoles"); 
                    break;

                    case 4:
                    System.out.println("Jueves");
                    break;

                    default:
                    System.out.println("Error. Dia incorrecto");
                }
    }
    
    
}

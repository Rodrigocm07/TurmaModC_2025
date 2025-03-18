
package ExerciciosJava;

import java.util.Scanner;

public class EX_I1 {
    public static void main(String[] args) {
        
            Scanner teclado = new Scanner(System.in);

                    System.out.print("Quantos dias foram trabalhados? ");
                       double dias = teclado.nextInt();
                       
                       double total = (200 * dias);
                       
               System.out.println("O total ficou: R$ " + String.format("%.2f",total ));
    }
   
}

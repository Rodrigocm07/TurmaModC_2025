package ExerciciosJava;

import java.util.Scanner;


public class EX_B1 {
    public static void main(String[] args) {
     
                Scanner teclado = new Scanner(System.in);
 System.out.print("Digite um numero ");
               int numero = teclado.nextInt();
    
               System.out.println("O numero anterior eh "+(numero -1)+" e o sucessor eh "+(numero +1));
    }
}

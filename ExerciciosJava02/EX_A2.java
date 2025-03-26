package ExerciciosJava2;

import java.util.Scanner;


public class EX_A2 {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero e vefique se ele é PAR: ");
        int numero = teclado.nextInt();
        
        boolean par;
        par = (numero %2 == 0);
 
        System.out.println("O numero é PAR? "+par);
    }
    
}

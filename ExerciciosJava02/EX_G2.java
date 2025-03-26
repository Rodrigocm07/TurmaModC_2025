package ExerciciosJava2;

import java.util.Scanner;


public class EX_G2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Verifique se o numero é multiplo de 3 ou 7: ");
        int numero = teclado.nextInt();
        
        boolean multiplo;
        multiplo = ((numero %3 == 0) && (numero %7 == 0));
        
        System.out.println("O numeor é multiplo de 3 ou 7? "+multiplo);
    }
    
}

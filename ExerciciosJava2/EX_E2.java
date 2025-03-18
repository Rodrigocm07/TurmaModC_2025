package ExerciciosJava2;

import java.util.Scanner;


public class EX_E2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Verifique se o numero está entre 10 e 20: ");
        int numero = teclado.nextInt();
        
        boolean comparador;
        comparador = ((numero >= 10) && (numero <=20));

        System.out.println("O numero está entre 10 e 20? "+comparador);
    }
    
}

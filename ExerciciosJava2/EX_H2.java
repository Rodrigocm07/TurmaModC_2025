package ExerciciosJava2;

import java.util.Scanner;


public class EX_H2 {
    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       
        System.out.print("Qual foi sua nota geral? ");
        int nota = teclado.nextInt();
        
        System.out.print("Qual foi sua frequencia geral? ");
        int frequencia = teclado.nextInt();
   
        boolean resultado;
        
        resultado = ((nota >= 60) && (frequencia>=75));
        
        System.out.println("Seu resultado é " +resultado);
    }
    
}

package ExerciciosJava2;

import java.util.Scanner;


public class EX_D2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro cateto: ");
        double cat1 = teclado.nextInt();
        
        System.out.print("Digite o segundo cateto: ");
        double cat2 = teclado.nextInt();
        
       double hip = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
       
        System.out.println("O resultado da hipotenusa é: "+String.format("%.2f",hip ));
    }
    
}

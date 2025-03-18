package ExerciciosJava2;

import java.util.Scanner;


public class EX_C2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Verique sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.print("Você possui uma carteira de motorista[true/false]?");
        boolean temCNH = teclado.nextBoolean();
        
        boolean podeDirigir = (idade >=18) && temCNH; 
       
        System.out.println("A pessoa pode dirigir? "+podeDirigir);
    }
    
}

package ExerciciosJava6;

import java.util.Scanner;

public class EX_C6 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
        int triangulo = 0;
    
        System.out.println("_______________________");
        System.out.println("\nLADOS DE UM TRIANGULO");
        System.out.println("_______________________");

        System.out.print("Digite o primeiro lado: ");
        int lado1 = teclado.nextInt();
        
        System.out.print("Digite o segundo lado:  ");
        int lado2 = teclado.nextInt();
        
        System.out.print("Digite o terceiro lado: ");
        int lado3 = teclado.nextInt();
         
        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) triangulo = 1;
            
        if (lado1 == lado2 && lado1 != lado3 && lado2 != lado3) triangulo = 2;
            
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) triangulo = 3;

            switch(triangulo){
          
            case 1 -> System.out.println("\nÉ um equilatero.");
            
            case 2 -> System.out.println("\nÉ um isósceles.");
            
            case 3 -> System.out.println("\nÉ escaleno.");
                }
        }
        
    }

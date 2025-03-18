package ExerciciosJava6;

import java.util.Scanner;


public class EX_E6 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        int ValorIMC = 0;
    
        System.out.print("Digite seu peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = teclado.nextDouble();
        
        double IMC = peso/(altura*altura);
        
        System.out.println("====================");
        System.out.println("Seu IMC é de: "+ String.format("%.2f",IMC));
        System.out.println("====================");

        
        if (IMC < 18.5){
            ValorIMC = (1);
        
        
        }else if (IMC >= 18.5 && IMC < 25){
            ValorIMC = (2);
            
            
        }else if (IMC >= 25 && IMC < 30){
           ValorIMC = (3); 
            
        }else if (IMC >= 30 && IMC < 40){
           ValorIMC = (4);  
            
        }
        if (IMC > 40){
           ValorIMC = (5);
       
        }
        switch(ValorIMC){
            
            case 1 -> System.out.println("\nEstá abaixo do peso!");
             
            case 2 -> System.out.println("\nEstá no peso ideal!");
             
            case 3 -> System.out.println("\nEstá em sobrepeso!");
             
            case 4 -> System.out.println("\nEstá com obesidade!");
             
            case 5 -> System.out.println("\nEstá com obesidade mórbida!");   
             
        }
        
    }
}
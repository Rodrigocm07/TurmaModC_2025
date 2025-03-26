package ExerciciosJava3;

import java.util.Scanner;


public class EX_H3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = teclado.nextDouble();
        
        double IMC = peso/(altura*altura);
        
        System.out.println("====================");
        System.out.println("Seu IMC é de: "+ String.format("%.2f",IMC));
        System.out.println("====================");

        
        if (IMC < 18.5){
        System.out.println("\nEstá abaixo do peso!");
        
        }else if (IMC >= 18.5 && IMC < 25){
            System.out.println("\nEstá no peso ideal!");
            
        }else if (IMC >= 25 && IMC < 30){
            System.out.println("\nEstá em sobrepeso!");
            
        }else if (IMC >= 30 && IMC < 40){
            System.out.println("\nEstá com obesidade!");
            
        }else{
            System.out.println("\nEstá com obesidade mórbida!");
        }
        
    }
}

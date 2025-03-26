package ExerciciosJava3;

import java.util.Scanner;


public class EX_E3 {
    public static void main(String[] args) {
             Scanner teclado = new Scanner(System.in);
   
        System.out.print("Qual a largura do terreno? ");
        double largura = teclado.nextDouble();

        System.out.print("Qual o comprimento do terreno? ");
        double comprimento = teclado.nextDouble();
        
        double metro = largura*comprimento;
        
        if (metro<100){
            System.out.println("\nSeu terreno é popular.");
        
        }else if (metro >=100 && metro <=500){
            System.out.println("\nSeu terreno é MASTER!");
        
        }else{
            System.out.println("\nSeu terreno é VIP!");  
        }
    }
}

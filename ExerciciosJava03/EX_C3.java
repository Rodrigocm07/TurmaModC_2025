package ExerciciosJava3;

import java.util.Scanner;


public class EX_C3 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
        System.out.print("Digite o primeiro numero: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int num2 = teclado.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro numero é maior que o segundo.");
        }else{
            System.out.println("O segundo numero é maior que o primeiro");
        }
    }
}

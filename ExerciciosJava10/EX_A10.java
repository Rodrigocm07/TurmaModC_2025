package ExerciciosJava10;

import java.util.Scanner;


public class EX_A10 {
    
    public static int somador(int n1, int n2){
        return n1+n2;
    }
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro numero para somar: ");
        int num1 = teclado.nextInt();
        
        System.out.print("Digite o segundo numero para somar: ");
        int num2 = teclado.nextInt();
        
        int resultado = somador(num1,num2);
        
        System.out.println("\nO resultado da soma é: "+resultado);
    }
}

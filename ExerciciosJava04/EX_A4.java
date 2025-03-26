package ExerciciosJava4;

import java.util.Scanner;
 public class EX_A4 {
    
     public static void main(String[] args) {
        
try (Scanner teclado = new Scanner(System.in)) {
System.out.print("Digite um número: ");

int numero = teclado.nextInt();
for (int i = 1; i <= 10; i++) {
                
System.out.println(numero + " x " + i + " = " + (numero * i));
    }}
    }
 }
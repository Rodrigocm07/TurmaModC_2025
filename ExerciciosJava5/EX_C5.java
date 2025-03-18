package ExerciciosJava5;

import java.util.Scanner;

public class EX_C5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            
            System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();
            
            while (numero <= 0) {
                System.out.println("Número inválido! Digite um número inteiro positivo.");
                System.out.print("Digite um número inteiro positivo: ");
                numero = scanner.nextInt();
            }
            
            int contador = 1;
            while (contador <= 10) {
                System.out.println(numero + " x " + contador + " = " + (numero * contador));
                contador++;
                
            }
        }
    }
}
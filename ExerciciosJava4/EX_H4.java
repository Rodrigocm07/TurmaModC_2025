package ExerciciosJava4;

import java.util.Scanner;

public class EX_H4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int soma = 0;
            for (int i = 1; i <= 5; i++) { 
                System.out.print("Digite sua idade: ");
                int idade = teclado.nextInt(); 
                soma += idade; 
            }
            System.out.println("A media das idades é: " + soma/5); 
        }
    }
}
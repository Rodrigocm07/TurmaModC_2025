package ExerciciosJava4;

import java.util.Scanner;

public class EX_E4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int soma = 0;
            for (int i = 1; i <= 5; i++) { 
                System.out.print("Digite um valor: ");
                int numero = teclado.nextInt(); 
                soma += numero; 
            }
            System.out.println("A media dos valores é: " + soma/2); 
        }
    }
}

    
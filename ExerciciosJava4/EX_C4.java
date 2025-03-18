package ExerciciosJava4;

import java.util.Scanner;

public class EX_C4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int soma = 0;
            for (int c = 1; c <= 10; c++) { 
                System.out.print("Digite um valor: ");
                int n = teclado.nextInt(); 
                soma += n; 
            }
            System.out.println("A soma dos valores é: " + soma); 
        }
    }
}

    
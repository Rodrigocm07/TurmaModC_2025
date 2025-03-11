package ExerciciosJava5;

import java.util.Scanner;


public class EX_D5 {

public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int numero;

        System.out.print("Digite um número inteiro não negativo: ");
        numero = scanner.nextInt();

        while (numero < 0) {
            System.out.println("Número inválido! Digite um número inteiro não negativo.");
            System.out.print("Digite um número inteiro não negativo: ");
            numero = scanner.nextInt();
        }

        int fatorial = 1;
        int contador = 1;
        while (contador <= numero) {
            fatorial *= contador;
            contador++;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
    }
}


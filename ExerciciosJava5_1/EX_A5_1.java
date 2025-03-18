package ExerciciosJava5_1;

import java.util.Scanner;


public class EX_A5_1 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int soma = 0;
            char resp;
            do{
                System.out.print("Digite um numero da soma: ");
                int num = teclado.nextInt();
                
                soma += num;
                System.out.print("Voce deseja continuar[s/n] ");
                resp = teclado.next().charAt(0);
            }while (resp !='n');
            System.out.println("A soma dos valores é: "+soma);
        }
    }
    }


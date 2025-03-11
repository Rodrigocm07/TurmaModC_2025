package ExerciciosJava5;

import java.util.Random;
import java.util.Scanner;


public class EX_E5 {

 public static void main(String[] args) {
     try (Scanner scanner = new Scanner(System.in)) {
         Random random = new Random();
         String escolhaUsuario = "";
         String escolhaComputador;
         int numeroUsuario, numeroComputador, soma;
         System.out.println("Jogo de Par ou Ímpar");
         while (!escolhaUsuario.equalsIgnoreCase("sair")) {
             System.out.print("Escolha par ou ímpar (ou digite 'sair' para encerrar): ");
             escolhaUsuario = scanner.next();
             
             if (!escolhaUsuario.equalsIgnoreCase("sair")) {
                 System.out.print("Digite um número de 0 a 5: ");
                 numeroUsuario = scanner.nextInt();
                 
                 // Gera número aleatório de 0 a 5
                 numeroComputador = random.nextInt(6);
                 soma = numeroUsuario + numeroComputador;
                 
                 if (soma % 2 == 0) {
                     escolhaComputador = "par";
                 } else {
                     escolhaComputador = "ímpar";
                 }
                 
                 System.out.println("Você jogou " + numeroUsuario + " e escolheu " + escolhaUsuario);
                 System.out.println("O computador jogou " + numeroComputador + " e escolheu " + escolhaComputador);
                 
                 if (escolhaUsuario.equalsIgnoreCase(escolhaComputador)) {
                     System.out.println("Você ganhou!");
                 } else {
                     System.out.println("O computador ganhou!");
                 }
             }
         }System.out.println("Fim de jogo.");
     }
    }
}


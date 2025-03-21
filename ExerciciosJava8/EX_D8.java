package ExerciciosJava8;

import java.util.Scanner;

public class EX_D8 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int tamanho;
            
            System.out.println("Quantas vezes deseja fazer a media? ");
            tamanho = teclado.nextInt();
            
            double[] notas = new double[tamanho]; 
            
            System.out.println("Digite as notas: ");
            for (int i = 0; i < tamanho; i++) { 
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = teclado.nextDouble();
            }
            double soma = 0;
            for (double nota: notas){
                soma += nota;
            }
            double media = soma / notas.length;
            System.out.println("A media é: "+ media);
        }
    }
}
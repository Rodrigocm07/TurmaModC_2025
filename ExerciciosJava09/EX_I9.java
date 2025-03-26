package ExerciciosJava9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX_I9 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Set<String> Alfabeto = new HashSet<>();

            System.out.print("Tamanho da lista: ");
            int tamanho = teclado.nextInt();
            teclado.nextLine();

            for (int i = 0; i < tamanho; i++) {
                System.out.print("Letra " + (i + 1) + ": ");
                Alfabeto.add(teclado.nextLine());
            }

            System.out.println("\nLista do Alfabeto:");
            for (String letra : Alfabeto) {
                System.out.println(letra);
            }

            System.out.println("\n O tamanho deste Alfabeto é: "+Alfabeto.size());
        }
    }
}
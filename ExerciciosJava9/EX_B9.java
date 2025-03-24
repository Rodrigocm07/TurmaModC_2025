package ExerciciosJava9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX_B9 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Set<String> frutas = new HashSet<>();

            System.out.print("Tamanho da lista: ");
            int tamanho = teclado.nextInt();
            teclado.nextLine();

            for (int i = 0; i < tamanho; i++) {
                System.out.print("Fruta " + (i + 1) + ": ");
                frutas.add(teclado.nextLine());
            }

            System.out.println("\nLista de frutas:");
            for (String fruta : frutas) {
                System.out.println(fruta);
            }

            frutas.remove("Banana");

            System.out.println("\nLista após remover a fruta:");
            for (String fruta : frutas) {
                System.out.println(fruta);
            }
        }
    }
}


package ExerciciosJava9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX_H9 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Set<String> Cidades = new HashSet<>();

            System.out.print("Tamanho da lista: ");
            int tamanho = teclado.nextInt();
            teclado.nextLine();

            for (int i = 0; i < tamanho; i++) {
                System.out.print("Cidade " + (i + 1) + ": ");
                Cidades.add(teclado.nextLine());
            }

            System.out.println("\nLista de cidades:");
            for (String Cidade : Cidades) {
                System.out.println(Cidade);
            }

            Cidades.remove("São Paulo");

            System.out.println("\nLista após remover São Paulo:");
            for (String Cidade : Cidades) {
                System.out.println(Cidade);
            }
        }
    }
}
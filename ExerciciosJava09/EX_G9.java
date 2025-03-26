package ExerciciosJava9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EX_G9 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Set<String> Cores = new HashSet<>();

            System.out.print("Tamanho da lista: ");
            int tamanho = teclado.nextInt();
            teclado.nextLine();

            for (int i = 0; i < tamanho; i++) {
                System.out.print("Cor " + (i + 1) + ": ");
                Cores.add(teclado.nextLine());
            }

            System.out.println("\n== Lista de cores ==");
            for (String Cor : Cores) {
                System.out.println(Cor);
            }

            boolean temVermelho = Cores.contains("Vermelho");
            System.out.println("\nNesta lista tem o Vermelho? "+temVermelho);

            }
        }
    }


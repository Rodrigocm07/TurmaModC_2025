
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prova_09 {
    
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Set<String> Animais = new HashSet<>();

            System.out.print("Tamanho da lista: ");
            int tamanho = teclado.nextInt();
            teclado.nextLine();

            for (int i = 0; i < tamanho; i++) {
                System.out.print("Animal " + (i + 1) + ": ");
                Animais.add(teclado.nextLine());
            }

            System.out.println("\nLista de animais:");
            for (String Animal : Animais) {
                System.out.println(Animal);
            }
            HashSet<String> set = new HashSet<>(Animais);
            boolean hasNumeros = set.size() == Animais.size();
            System.out.println("\n Nesta lista tem animais duplicados? "+hasNumeros);
        }
    }
}    


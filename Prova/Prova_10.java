import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prova_10 {
    
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Set<Integer> numeros = new HashSet<>();

            System.out.print("Tamanho da lista: ");
            int tamanho = teclado.nextInt();
            teclado.nextLine();

            for (int i = 0; i < tamanho; i++) {
                System.out.print((i + 1) + "º numero: ");
                numeros.add(teclado.nextInt());
            }

            System.out.println("\nLista de numeros:\n");
            for (int Lista : numeros) {
                System.out.println(Lista);
            }
            HashSet<Integer> set = new HashSet<>(numeros);
            boolean hasNumeros = set.size() == numeros.size();
            System.out.println("\n Nesta lista tinha numeros duplicados? "+hasNumeros);
        }
    }
}    

import java.util.Scanner; 
import java.util.ArrayList; 
 
public class Prova_07 { 
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Digite o tamanho do Array: ");
            int tamanho = sc.nextInt();
            
            int[] numeros = new int[tamanho];
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }
            
            ArrayList<Integer> impares = new ArrayList<>();
            for (int numero : numeros) {
                if (numero % 2 != 0) {
                    impares.add(numero);
                }
            }
            
            System.out.println("Números impares: " + impares.reversed());
        } 
    } 
} 
package ExerciciosJava10;


import java.util.Scanner;

public class EX_E10 {

    public static int contarVogais(String texto) {
        int contador = 0;
        texto = texto.toLowerCase(); 
        
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.print("Digite uma frase: ");
            String frase = teclado.nextLine();
            
            int totalVogais = contarVogais(frase);
            
            System.out.println("\nResultado:");
            System.out.println("Frase digitada: \"" + frase + "\"");
            System.out.println("Total de vogais: " + totalVogais);
        }
    }
}

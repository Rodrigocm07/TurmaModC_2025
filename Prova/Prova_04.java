
import java.util.Scanner;


public class Prova_04 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Digite a frase:");
            String frase = sc.nextLine();
            
            String[] palavrinhas = frase.split(" ");
            
            int cont = 0;
            
            for (String palavra : palavrinhas) {
                if (palavra.length() > 4) {
                    cont++;
                }
            }
            
            System.out.println("Número de palavras com mais de 4 letras: " + cont);
        }
    }
}

    


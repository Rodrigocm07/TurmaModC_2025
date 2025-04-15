
import java.util.Scanner;


public class Prova_05 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int cont = 0;
            int idade;
            
            System.out.print("Digite o tamanho do grupo: ");
            int tamanho = sc.nextInt();
            
            
            for (int i = 0; i < tamanho; i++) {
                System.out.print((i+1)+"º idade: ");
                idade = sc.nextInt();
                        
            if (idade >= 18 && idade <= 30) {
                cont++;
            }
            }
            System.out.println("\n A quantidade de pessoas que tem entre 18 e 30 é: "+cont);
        }
        }
    }


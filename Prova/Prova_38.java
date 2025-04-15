import java.util.Scanner;


public class Prova_38 {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int cont = 0;
            int num;
            
            System.out.print("Digite o tamanho Array: ");
            int tamanho = sc.nextInt();
            
            
            for (int i = 0; i < tamanho; i++) {
                System.out.print((i+1)+"º numero: ");
                num = sc.nextInt();
                        
            if (num >= 20 && num <= 70) {
                cont++;
            }
            }
            System.out.println("\n A quantidade de numeros entre 20 e 70: "+cont);
        }
        }
    }
// eu acreditei que deu certo, pensa com carinho :)

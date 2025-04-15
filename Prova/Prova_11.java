
import java.util.Scanner;


public class Prova_11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    
    
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        double quadrado = Math.sqrt(num);
        
        if (quadrado == (int)quadrado) {
            System.out.println("É um quadrado perfeito");
        }else{
            System.out.println("Não é um quadrado perfeito");
        }

    }
    
}

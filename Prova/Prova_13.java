
import java.util.Scanner;


public class Prova_13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();
        
        if (frase.toLowerCase().contains("java")) {        
        System.out.println("Nesta frase tem JAVA");
                }else{
            System.out.println("Nesta frase NÃO tem JAVA");
        } 
    }
}

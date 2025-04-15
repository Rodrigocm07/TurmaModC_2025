
import java.util.Scanner;


public class Prova_24 {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);    
     
    System.out.print("Digite um texto: ");
        String txt = sc.nextLine();
        
     
        String resultado = txt.toLowerCase().replaceAll("[aeiou]", "*"); 
     
     
     System.out.println("Texto com vogais substituídas: ");
        System.out.println(resultado);
    }
}

package ExerciciosJava8;

import java.util.HashSet;
import java.util.Scanner;


public class EX_E8 {
    public static void main(String[] args) {
        
          HashSet<String> palavras = new HashSet<>();
          Scanner teclado = new Scanner(System.in);
          
           int contador = 0;
            String nomes;
            System.out.println("Adicione os nomes a lista: ");
            do{
                contador++;
                
                System.out.print("Nome "+(contador)+": ");
                nomes = teclado.nextLine();
                
                if (!nomes.equalsIgnoreCase("FIM")) {
                palavras.add(nomes);
            }
              
            }while (!nomes.equalsIgnoreCase("fim"));
            
            System.out.println("== lista de nomes ==");
            for(String lista : palavras){
                System.out.println(lista);
           
            }       
    }
}

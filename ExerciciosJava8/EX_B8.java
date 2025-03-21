package ExerciciosJava8;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_B8 {
    public static void main(String[] args) {
        
        
        try (Scanner teclado = new Scanner(System.in)) {
            ArrayList<String> palavras = new ArrayList<>();
            
            int contador = 0;
            String nomes;
            System.out.println("Adicione os nomes a lista: ");
            do{
                contador++;
                
                System.out.print("Nome "+(contador)+": ");
                nomes = teclado.nextLine().toUpperCase();
                
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
}


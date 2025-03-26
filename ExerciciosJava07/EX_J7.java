package ExerciciosJava7;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_J7 {
    public static void main(String[] args) {
        
    try (Scanner teclado = new Scanner(System.in)){
    
     ArrayList<String> listadeAnimais = new ArrayList<>();

      while(true){         

         System.out.println("Adicione a lista de animais: ");
         String animais = teclado.nextLine();
        if (animais.contentEquals("fim")){             
      break; 
        }
         listadeAnimais.add(animais);
     }
        System.out.println("== Lista de animais ==");
        for(String lista : listadeAnimais){
        System.out.println(lista);
        }
        ArrayList<String> listadeAnimais2 = new ArrayList<>(listadeAnimais);
        System.out.println("\n== Lista de animais 2==");
        for(String lista : listadeAnimais2){
        System.out.println(lista);
        }  
    }    
}
}
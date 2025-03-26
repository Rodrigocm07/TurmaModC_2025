package ExerciciosJava7;

import java.util.ArrayList;
import java.util.Scanner;


public class EX_H7 {
    public static void main(String[] args) {
        
    try (Scanner teclado = new Scanner(System.in)){
    
     ArrayList<String> listadePaises = new ArrayList<>();

      
     int cont = 0;
      while(true){         
         cont++;
         System.out.println("Adicione o "+cont+ "º nome do pais na lista: ");
         String paises = teclado.nextLine();
        if (paises.contentEquals("fim")){             
      break; 
        }
         listadePaises.add(paises);
     }
        System.out.println("== Lista de paises ==");
        for(String lista : listadePaises){
        System.out.println(lista);
        }
        }  
    }    
}




import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Prova_35 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<String> lista = new ArrayList<>();
    
    String palavra;
    
        while(true){
                System.out.println("Adicione na lista: ");
                palavra = sc.nextLine();
                if (palavra.contentEquals("fim")){
                    break;
                }
                   lista.add(palavra);
    }

            
            Collections.sort(lista); 
            System.out.println("Array ordenado: " + lista); 
}
}


import java.util.ArrayList;
import java.util.Scanner;


public class Prova_02 {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)){
            ArrayList<String> listadeNomes = new ArrayList<>();
            int cont = 0;
            while(true){
                cont++;
                System.out.print("Adicione o "+cont+ "º nome na lista: ");
                String nomes = teclado.nextLine();
                if (nomes.contentEquals("fim")){
                    break;
                }
                if (nomes.length() > 6) {
                listadeNomes.add(nomes);
                }
            } 
                System.out.println("== Lista de nomes ==");
                 for(String lista : listadeNomes){
                 System.out.println(lista);    
            }   
        }
    }
}

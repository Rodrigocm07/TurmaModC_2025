import java.util.ArrayList; 
import java.util.Scanner;
 
public class Prova_08 { 
    public static void main(String[] args) { 

        ArrayList<Integer> lista1 = new ArrayList<>(); 
        ArrayList<Integer> lista2 = new ArrayList<>(); 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da lista: ");
        int tamanho = sc.nextInt();
        
        
        System.out.println("Digite a lista 1\n");
        for (int i = 0; i < tamanho; i++) {
        System.out.print((i+1)+"º numero: ");
        int n1 = sc.nextInt();
        lista1.add(n1);
        }
        
        
        System.out.println("Digite a lista 2\n");
        for (int i = 0; i < tamanho; i++) {
        System.out.print((i+1)+"º numero: ");
        int n2 = sc.nextInt();
        lista2.add(n2);
        }
        
       
         
        System.out.println("\nLista 1: " + lista1); 
        System.out.println("\nLista 2: " + lista2); 
         
        ArrayList<Integer> interseccao = new ArrayList<>(); 
         
        for (int numeros : lista1) { 
            if (lista2.contains(numeros)) { 
                interseccao.add(numeros); 
            } 
        } 
         
        System.out.println("\nIntersecção das listas: " + interseccao); 
    } 
} 


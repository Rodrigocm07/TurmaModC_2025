
package EX08_Alunos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        alunos a = new alunos();
        
        System.out.print("Digite seu nome: ");
        a.nome = sc.nextLine();
        
        System.out.print("Digite sua matricula: ");
        a.matricula = sc.nextInt();
        
        System.out.println("\n Sua média nas notas é de: "+ a.calcularMedia());
        
    }
    
}

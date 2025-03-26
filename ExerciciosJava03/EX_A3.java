package ExerciciosJava3;

import java.util.Scanner;


public class EX_A3 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);

    System.out.print("Qual seu nome? ");
    String nome = teclado.nextLine();
    
    System.out.print("Qual seu sexo? ");
    String sexo = teclado.nextLine();

    if("homem".equals(sexo)){
        System.out.print("Ola "+nome+" qual o valor da sua compra? ");
        double produto = teclado.nextDouble();
        
        double desconto = (produto*0.05);
        double dinheiro = produto - desconto;
        
        System.out.println("\nSeu desconto na compra é de R$ "+dinheiro);
        
    }else{
        System.out.print("Ola "+nome+" qual o valor da sua compra? ");
        double produto = teclado.nextDouble();
        
        double desconto = (produto*0.13);
        double dinheiro = produto - desconto;
        
        System.out.println("\nSeu desconto na compra é de R$ "+dinheiro);
        
        
    }    
    }
}

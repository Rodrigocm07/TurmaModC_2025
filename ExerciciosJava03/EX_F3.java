package ExerciciosJava3;

import java.util.Scanner;


public class EX_F3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
        System.out.print("Qual o seu nome? ");
        String nome = teclado.nextLine();
        
        System.out.print("Qual é seu salario? ");
        double salario = teclado.nextDouble();
        
        System.out.print("Quantos anos você trabalha conosco? ");
        double anos = teclado.nextDouble();
        
        System.out.println("=========================");
        System.out.println("nome: "+nome);
        System.out.println("salario: R$ "+salario);
        System.out.println("Anos trabalhado: "+anos);
        System.out.println("=========================");
        
        if (anos < 3){
        
        double aumento = (salario*0.03);
        double resultado = aumento+salario;
        
        System.out.println("\nParabéns! Seu salario agora é: R$ "+resultado);
            
        }else if (anos >= 3 && anos <= 10){
           
        double aumento = (salario*0.125);
        double resultado = aumento+salario;
            
        System.out.println("\nParabéns! Seu salario agora é: R$ "+resultado);
        
        }else{
         
        double aumento = (salario*0.20);
        double resultado = aumento+salario;
        
        System.out.println("\nParabéns! Seu salario agora é: R$ "+resultado);


        }
    }
}

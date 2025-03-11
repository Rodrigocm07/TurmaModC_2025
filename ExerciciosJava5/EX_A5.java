package ExerciciosJava5;

import java.util.Scanner;


public class EX_A5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        int cont = 0;
        
        System.out.print("Digite a idade do aluno [-1 para sair]: ");
        int idade = teclado.nextInt();
        
        while (idade >= 0){
            soma += idade;
            cont++;
        System.out.print("Digite a idade do aluno [-1 para sair]: ");
        idade = teclado.nextInt();
        }
        if (cont > 0){
            double media = soma / cont;
            System.out.printf("A media de idade da turma é: %.2f%n",media);
        }else{
            System.out.println("Nenhuma idade foi informada");
        }
    }   
    }


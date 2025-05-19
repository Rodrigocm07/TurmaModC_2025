package EX03_Carro;

import java.util.Scanner;


public class Main {
 public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
        
            Carro carro = new Carro();
            
            System.out.print("Digite a marca: ");
            carro.marca = sc.nextLine();
            
            System.out.print("Digite o modelo: ");
            carro.modelo = sc.nextLine();
            
            System.out.print("Digite o ano: ");
            carro.ano = sc.nextInt();
            
            carro.ligado = true;
            
            System.out.println("## Informações do carro cadastrado ##");
            System.out.println("Marca: "+carro.marca);
            System.out.println("Modelo: "+carro.modelo);
            System.out.println("Ano: "+carro.ano);
            
            System.out.print("Deseja ligar o carro? (s/n) ");
            sc.nextLine();
            
            String opcao = sc.nextLine();
            
            if (opcao.equalsIgnoreCase("s")) {
                carro.ligar();
            }
            System.out.print("Deseja desligar o carro? (s/n) ");
            sc.nextLine();
            
             if (opcao.equalsIgnoreCase("s")) {
                carro.desligar();
            }
        }
    }
}

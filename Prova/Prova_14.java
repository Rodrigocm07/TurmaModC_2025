import java.util.Scanner;
public class Prova_14 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int menu;
            do {
                System.out.println("\n======== MENU ========");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Consultar");
                System.out.println("3 - Sair");
                System.out.print("Opção: ");
                
                menu = teclado.nextInt();
                switch(menu) {
                    case 1 -> System.out.println("CADASTRO REALIZADO");
                    case 2 -> System.out.println("CONSULTA FEITA");
                    case 3 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (menu != 3);
        }
    }
}


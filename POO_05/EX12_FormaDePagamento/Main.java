package EX12_FormaDePagamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int op;
            
            do {
                System.out.println("\n==== MENU DE PAGAMENTO ====");
                System.out.println("1 - Pagar com Cartão de Crédito");
                System.out.println("2 - Pagar com Boleto");
                System.out.println("3 - Pagar com Pix");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                op = sc.nextInt();
                
                if (op == 0) break;
                
                System.out.print("Digite o valor do pagamento: R$");
                double valor = sc.nextDouble();
                
                FormaPagamento pagamento = switch (op) {
                    case 1 -> new CartaoCredito();
                    case 2 -> new Boleto();
                    case 3 -> new Pix();
                    default -> null;
                };
                
                if (pagamento != null) {
                    pagamento.processarPagamento(valor);
                } else {
                    System.out.println("Opção inválida.");
                }
                
            } while (op != 0);
        }
    }
}


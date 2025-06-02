package EX07_Pagamento;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Valor: ");
            double valor = sc.nextDouble();
            System.out.println("Forma: \n1 - Cartão \n2 - Boleto \n3 - PIX");
            int op = sc.nextInt();
            
            Pagamento pgto = null;
            switch (op) {
                case 1 -> pgto = new PagamentoCartao();
                case 2 -> pgto = new PagamentoBoleto();
                case 3 -> pgto = new PagamentoPix();
            }
            
            if (pgto != null) {
                pgto.processarPagamento(valor);
            }
        }
    }

}

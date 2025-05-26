package EX07_Pagamento;

import java.util.Scanner;


public class Main {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Valor do pagamento:");
        double valor = scanner.nextDouble();
        
        Pagamento pagamento = new CartaoCredito();
        pagamento.efetuarPagamento(valor);
    }
    }
}

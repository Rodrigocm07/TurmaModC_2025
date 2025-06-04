package EX12_FormaDePagamento;


public class CartaoCredito extends FormaPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$%.2f no cartão de crédito.\n", valor);
    }
    
}

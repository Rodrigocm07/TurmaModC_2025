package EX12_FormaDePagamento;


public class Boleto extends FormaPagamento {

      @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$%.2f via boleto bancário.\n", valor);
    }
    
}

package EX12_FormaDePagamento;


public class Pix extends FormaPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$%.2f via Pix.\n", valor);
    }
    
}

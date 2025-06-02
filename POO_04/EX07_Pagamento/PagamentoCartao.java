package EX07_Pagamento;

class PagamentoCartao extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via cartão");
    }
}

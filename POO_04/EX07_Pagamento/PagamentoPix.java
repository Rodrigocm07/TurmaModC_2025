package EX07_Pagamento;


class PagamentoPix extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando PIX de R$" + valor);
    }
}


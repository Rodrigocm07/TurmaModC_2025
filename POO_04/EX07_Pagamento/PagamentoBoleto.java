package EX07_Pagamento;


class PagamentoBoleto extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto de R$" + valor);
    }
}


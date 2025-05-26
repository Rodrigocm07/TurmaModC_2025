package EX07_Pagamento;


class CartaoCredito implements Pagamento {
    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
    }
}


package EX04_ContaBancaria;


class ContaPoupanca extends ContaBancaria {

    private final double taxaRendimento;

    public ContaPoupanca(String num, double saldo, double taxa) {
        super(num, saldo);
        this.taxaRendimento = taxa;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado");
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
        System.out.println("Rendimento aplicado");
    }
}


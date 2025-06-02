package EX04_ContaBancaria;

class ContaCorrente extends ContaBancaria {

    private final double limite;

    public ContaCorrente(String num, double saldo, double lim) {
        super(num, saldo);
        this.limite = lim;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado");
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

package EX04_ContaBancaria;


abstract class ContaBancaria {

    protected double saldo;
    protected String numeroConta;

    public ContaBancaria(String num, double saldoInicial) {
        this.numeroConta = num;
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public void consultarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
}

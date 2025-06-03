package EX06_ContaBancaria;


public class ContaBancaria {

    private final String numeroConta;
    private final double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
        public void exibirInfo() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }
    
}

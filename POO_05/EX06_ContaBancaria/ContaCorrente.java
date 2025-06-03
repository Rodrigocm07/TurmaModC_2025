package EX06_ContaBancaria;


public class ContaCorrente extends ContaBancaria {

    private final double limite;

    public ContaCorrente(String numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }
    
     @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Limite: R$" + limite);
    }
    
}

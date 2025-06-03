package EX06_ContaBancaria;


public class ContaPoupanca extends ContaBancaria{

    private final double taxaJuros;

    public ContaPoupanca(String numeroConta, double saldo, double taxaJuros) {
        super(numeroConta, saldo);
        this.taxaJuros = taxaJuros;
    }
    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Taxa de juros: " + taxaJuros + "%");
    }
    
}

package EX06_ContaBancaria;

public class ContaInvestimento extends ContaBancaria {

    private final String tipoInvestimento;

    public ContaInvestimento(String numeroConta, double saldo, String tipoInvestimento) {
        super(numeroConta, saldo);
        this.tipoInvestimento = tipoInvestimento;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de investimento: " + tipoInvestimento);
    }
}

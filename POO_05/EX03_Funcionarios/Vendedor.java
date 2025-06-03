package EX03_Funcionarios;

public class Vendedor extends Funcionarios {

    private final double comissao;

    public Vendedor(String nome, double salario, String cargo, double comissao) {
        super(nome, salario, cargo);
        this.comissao = comissao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("comissao: R$" + comissao);
    }
}

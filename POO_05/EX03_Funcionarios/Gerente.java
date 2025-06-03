package EX03_Funcionarios;

public class Gerente extends Funcionarios {

    private final String departamento;

    public Gerente (String nome, double salario, String cargo, String departamento) {
        super(nome, salario, cargo);
        this.departamento = departamento;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Departamento: " + departamento);
    }
}

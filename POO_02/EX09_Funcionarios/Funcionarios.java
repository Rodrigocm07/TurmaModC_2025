package EX09_Funcionarios;


public class Funcionarios {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionarios(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.println("Salário aumentado com sucesso!");
    }

    public void status() {
        System.out.println("----- FUNCIONÁRIO -----");
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.println("------------------------");
    }
}

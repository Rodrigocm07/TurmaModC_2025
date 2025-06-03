package EX03_Funcionarios;


public class Funcionarios {

        private final String nome;
        private final double salario;
        private final String cargo;

    public Funcionarios(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

          public void exibirInfo() {
              System.out.println("Nome: "+nome);
              System.out.println("Salario: "+salario);
              System.out.println("cargo: "+cargo);
          }
}

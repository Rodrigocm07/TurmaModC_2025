
package EX06_funcionarios;


public class funcionarios {

    String nome;
    double salario;
    String departamento;
    
    double aumentarSalario(double percentual){
        double calculo = salario * percentual;
        
        return salario + calculo;
    }
    
}

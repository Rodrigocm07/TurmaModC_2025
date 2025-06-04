package EX13_UsuariosDeUmSistema;

public class Leitor extends Usuario {

    private final String historicoLeitura;

    public Leitor(String historicoLeitura, String nome, String login) {
        super(nome, login);
        this.historicoLeitura = historicoLeitura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Histórico de leitura: " + historicoLeitura);
    }
}

package EX13_UsuariosDeUmSistema;

public class Administrador extends Usuario {

    private final int nivelAcesso;

    public Administrador(String nome, String login, int nivelAcesso) {
        super(nome, login);
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Nível de acesso: " + nivelAcesso);
    }

}

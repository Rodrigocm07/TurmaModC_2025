package EX13_UsuariosDeUmSistema;

public class Editor extends Usuario {

    private final String permissoesEdicao;

    public Editor(String nome, String login, String permissoesEdicao) {
        super(nome, login);
        this.permissoesEdicao = permissoesEdicao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Permissões de edição: " + permissoesEdicao);
    }

}

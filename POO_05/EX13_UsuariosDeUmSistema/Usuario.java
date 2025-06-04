package EX13_UsuariosDeUmSistema;


public class Usuario {

    private final String nome;
    private final String login;

    public Usuario(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }
    
     public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Login: " + login);
    }
     
}

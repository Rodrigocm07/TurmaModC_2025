package Lista_de_Tarefas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {


    private static final String URL = "jdbc:mysql://localhost:3306/Lista_tarefas";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public Connection conectar() {
        try {
            System.out.println("Conectando ao banco de dados...");
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão estabelecida com sucesso!");
            return conexao;

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null; 
        }
    }
}

package Lista_de_Tarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarTarefas {
    public void listarTodas() {
        ConexaoBD CBD = new ConexaoBD();

        try (Connection conexao = CBD.conectar()) {
            if (conexao == null) {
                System.out.println("Falha ao conectar ao banco de dados.");
                return;
            }

            String sql = "SELECT * FROM tarefas ORDER BY id;";

            try (PreparedStatement ps = conexao.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                
                System.out.println("\n--- LISTA DE TAREFAS ---");
                while (rs.next()) {
                    System.out.println(
                        "ID: " + rs.getInt("id") +
                        "\nTítulo: " + rs.getString("titulo") +
                        "\nDescrição: " + rs.getString("descricao") +
                        "\nStatus: " + rs.getString("status") +
                        "\nData: " + rs.getString("data_criacao") +
                        "\n----------------------"
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar tarefas: " + e.getMessage());
        }
    }
}
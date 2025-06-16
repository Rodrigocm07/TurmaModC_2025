package Lista_de_Tarefas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AtualizarTarefas {

    public void atualizar(String id, String novoTitulo, String novaDescricao, String novoStatus) throws SQLException {
        ConexaoBD CBD = new ConexaoBD();

        try (Connection conexao = CBD.conectar()) {
            if (conexao == null) {
                System.out.println("Falha ao conectar ao banco de dados.");
                return;
            }

            String sql = "UPDATE tarefas SET titulo = ?, descricao = ?, status = ? WHERE id = ?;";

            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, novoTitulo);
                ps.setString(2, novaDescricao);
                ps.setString(3, novoStatus);
                ps.setString(4, id);
                
                int linhasAfetadas = ps.executeUpdate();
                
                if (linhasAfetadas > 0) {
                    System.out.println("Tarefa atualizada com sucesso!");
                } else {
                    System.out.println("Nenhuma tarefa encontrada com o ID: " + id);
                }
            } catch (SQLException e) {
                System.out.println("Erro ao atualizar a tarefa: " + e.getMessage());
            }
        }
    }
}
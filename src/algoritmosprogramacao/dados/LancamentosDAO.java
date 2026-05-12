package algoritmosprogramacao.dados;

import algoritmosprogramacao.modelo.Lancamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LancamentosDAO {
    private final Connection conexao;
    public LancamentosDAO(){
        this.conexao = new ConexaoBD().getConnection();
    }
    public List<Lancamentos> buscarLancamentosPorId(int id) {
        List lista = new ArrayList();
        String sql = "SELECT * FROM lancamentos" +
                " WHERE id_cliente = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lancamentos lancamentos = new Lancamentos();
                lancamentos.setIdCliente(rs.getInt("id_cliente"));
                lancamentos.setDataHora(rs.getTimestamp("data_hora"));
                lancamentos.setValor(rs.getDouble("valor"));
                lancamentos.setTipo(rs.getString("tipo"));
                lista.add(lancamentos);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao buscar lançamentos!");
            throw new RuntimeException(e);
        }
        return lista;
    }
}

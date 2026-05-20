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
    
    public void apagarLancamentos(int id) {
        String sql = "DELETE FROM lancamentos"
                + " WHERE id_cliente = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao apagar lançamentos!");
            throw new RuntimeException(e);
        }
    }

    public void depositar(int id, double valor) {
        String sql = "INSERT INTO lancamentos"
                + "(id_cliente, valor, tipo)"
                + " VALUES (?, ?, ?)";
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setDouble(2, valor);
            ps.setString(3, "C");
            ps.execute();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao depositar!");
            throw new RuntimeException(e);
        }
    }

    public void sacar(int id, double valor) {
        String sql = "INSERT INTO lancamentos"
                + "(id_cliente, valor, tipo)"
                + " VALUES (?, ?, ?)";
        try{
            double resultado = verificarSaldo(id);
            if (resultado >= valor) {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                ps.setDouble(2, valor);
                ps.setString(3, "D");
                ps.execute();
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "Saldo insuficiente!");
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao sacar!");
            throw new RuntimeException(e);
        }
    }
    
    private double verificarSaldo(int id){
        String sqlCredito = "SELECT SUM(valor) AS total"
                + " FROM lancamentos"
                + " WHERE id_cliente = ?"
                + " GROUP BY tipo"
                + " HAVING tipo = 'C'";
        String sqlDebito = "SELECT SUM(valor) AS total"
                + " FROM lancamentos"
                + " WHERE id_cliente = ?"
                + " GROUP BY tipo"
                + " HAVING tipo = 'D'";
        double resultado = 0;
        try {
            PreparedStatement psCredito = conexao.prepareStatement(sqlCredito);
            psCredito.setInt(1, id);
            ResultSet rsCredito = psCredito.executeQuery();
            PreparedStatement psDebito = conexao.prepareStatement(sqlDebito);
            psDebito.setInt(1, id);
            ResultSet rsDebito = psDebito.executeQuery();
            if (rsCredito.next() && rsDebito.next()) {
                resultado += rsCredito.getDouble("total");
                resultado -= rsDebito.getDouble("total");
            }
            return resultado;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro ao buscar lançamentos!");
            throw new RuntimeException(e);
        }
    }
}

package dao;

import conexao.ConexaoMySQL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Contato;

public class ContatoDAO {
    
    Connection conexao = null;
    PreparedStatement sql = null;
    ResultSet rset = null;
    
    public int inserir(Contato contato) {

        String insert = "INSERT INTO contatos(nome, idade, datacadastro) VALUES (?, ?, ?)";
        int linha = 0;
        try {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(insert);
            sql.setString(1, contato.getNome());
            sql.setInt(2, contato.getIdade());
            sql.setDate(3, new Date(contato.getDataCadastro().getTime()));
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return linha;

    }
        
    public int atualizar(Contato contato) {
        String update = "UPDATE contatos SET nome = ?, idade = ? WHERE id = ?";
        int linha = 0;
        try {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(update);
            sql.setString(1, contato.getNome());
            sql.setInt(2, contato.getIdade());
            sql.setInt(3, contato.getId());
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return linha;

    }
    
    public int apagar(int id) {
        String delete = "DELETE FROM contatos WHERE id = ?";
        int linha = 0;
        try {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(delete);
            sql.setInt(1, id);
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return linha;
    }
   
    public List<Contato> listarContatos() {

        String select = "SELECT * FROM contatos";

        List<Contato> contatos = new ArrayList<Contato>();

        try {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(select);

            rset = sql.executeQuery();

            while (rset.next()) {

                Contato contato = new Contato();

                contato.setId(rset.getInt("id"));
                contato.setNome(rset.getString("nome"));
                contato.setIdade(rset.getInt("idade"));
                contato.setDataCadastro(rset.getDate("datacadastro"));

                contatos.add(contato);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return contatos;
    }

    public Contato encontrarContato(int id) {

        String select = "SELECT * FROM contatos WHERE id = ?";

        Contato contato = null;

        try {
            conexao = ConexaoMySQL.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(select);

            sql.setInt(1, id);

            rset = sql.executeQuery();

            while (rset.next()) {

                contato = new Contato();

                contato.setId(rset.getInt("id"));
                contato.setNome(rset.getString("nome"));
                contato.setIdade(rset.getInt("idade"));
                contato.setDataCadastro(rset.getDate("datacadastro"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return contato;
    }	

    private void fecharConexao() {
        try {
            if (rset != null) {
                rset.close();
            }
            if (sql != null) {
                sql.close();
            }

            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
}

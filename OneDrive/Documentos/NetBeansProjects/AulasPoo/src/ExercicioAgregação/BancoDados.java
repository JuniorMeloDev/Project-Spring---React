package ExercicioAgregação;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BancoDados {

    static Connection conexao = null;
    static Statement declaracao = null;
    static ResultSet resultado = null;

    public void conectar() throws Exception {
        String url = "jdbc:mysql://localhost:3306/db_ExercicioAgregacao";

        conexao = DriverManager.getConnection(url, "root", "05Peitickman");
        declaracao = conexao.createStatement();
    }

    public boolean isConected() {
        if (conexao != null) {
            return true;
        } else {
            return false;
        }
    }

    public void desconectar() throws Exception {
        if (isConected()) {
            conexao.close();
        }
    }

    public String inserirDesenvolvedor(Desenvolvedor des) {
        try {
            conectar();
            String query = "INSERT INTO tb_Desenvolvedor (nome, valorHora) VALUES ('"
                    + des.getNome() + "', '" + des.getValorHora() + "');";
            PreparedStatement inserir = conexao.prepareStatement(query);
            inserir.executeUpdate();
            desconectar();
            return ("\n Desenvolvedor Cadastrado com sucesso!!!\n");
        } catch (Exception erro) {
            return ("- Erro " + erro.getMessage());
        }
    }

    public String inserirFuncionalidade(Funcionalidade fun) {
        try {
            conectar();
            String query = "INSERT INTO tb_Funcionalidade (descricao, minutosParaImplementar, valor, tipo) VALUES ('"
                    + fun.getDescricao() + "', '" + fun.getMinutosParaImplementar() + "', '" + fun.getValor() + "', '" + fun.getTipo() + "');";
            PreparedStatement inserir = conexao.prepareStatement(query);
            inserir.executeUpdate();
            desconectar();
            return ("\n Funcionalidade Cadastrada com sucesso!!!\n");
        } catch (Exception erro) {
            return ("- Erro " + erro.getMessage());
        }
    }

    public Desenvolvedor pesquisarDesenvolvedor(int idDesenvolvedor) {
        Desenvolvedor des = null;
        try {
            conectar();
            String query = "SELECT * FROM tb_Desenvolvedor WHERE id_Desenvolvedor = " + idDesenvolvedor + ";";
            PreparedStatement pesquisa = conexao.prepareStatement(query);
            ResultSet resultado = pesquisa.executeQuery();

            while (resultado.next()) {
                des = new Desenvolvedor();
                des.setIdDesenvolvedor(resultado.getInt("id_Desevolvedor"));
                des.setNome(resultado.getString("nome"));
                des.setValorHora(resultado.getDouble("valorHora"));
            }
            desconectar();
            return des;
        } catch (Exception erro) {
            des = new Desenvolvedor();
            des.setNome("Erro " + erro.getMessage());
            return des;
        }
    }

    public Funcionalidade pesquisarFuncionalidade(int idFuncionalidade) {
        Funcionalidade fun = null;
        try {
            conectar();
            String query = "SELECT * FROM tb_Funcionalidade WHERE id_Funcionalidade = " + idFuncionalidade + ";";
            PreparedStatement pesquisa = conexao.prepareStatement(query);
            ResultSet resultado = pesquisa.executeQuery();

            while (resultado.next()) {
                fun = new Funcionalidade();
                fun.setIdFuncionalidade(resultado.getInt("id_Funcionalidade"));
                fun.setDescricao(resultado.getString("Descricao"));
                fun.setMinutosParaImplementar(resultado.getInt("minutosParaImplementar"));
                fun.setValor(resultado.getInt("valor"));
               // fun.setTipo(resultado.getChars()("tipo"));
            }
            desconectar();
            return fun;
        } catch (Exception erro) {
            fun = new Funcionalidade();
            fun.setDescricao("Erro " + erro.getMessage());
            return fun;
        }
    }

  /*  public String alterarUsuario(Usuario us) {
        try {
            conectar();

            String query = "UPDATE tb_Usuario SET nome = '"
                    + us.getNome() + "', email = '" + us.getEmail()
                    + "' WHERE id_Usuario = " + us.getId() + ";";
            PreparedStatement alterar = conexao.prepareStatement(query);
            alterar.executeUpdate();
            desconectar();
            return ("\n Alteração realizada com sucesso!!!\n");
        } catch (Exception erro) {
            return ("- Erro " + erro.getMessage());
        }
    }

    public List<Usuario> listarTodosUsuario() throws Exception {

        Usuario u = null;
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        conectar();
        String query = "SELECT * FROM tb_usuario";
        PreparedStatement pesquisa = conexao.prepareStatement(query);
        ResultSet resultado = pesquisa.executeQuery();
        while (resultado.next()) {
            u = new Usuario();
            u.setId(resultado.getInt("id_Usuario"));
            u.setNome(resultado.getString("nome"));
            u.setEmail(resultado.getString("email"));
            listaUsuarios.add(u);
        }
        desconectar();
        return listaUsuarios;
    }

    public String excluirUsuario(int id) {

        try {
            conectar();

            String query = "DELETE FROM tb_Usuario "
                    + "WHERE id_Usuario = " + id + ";";
            PreparedStatement inserir = conexao.prepareStatement(query);
            inserir.executeUpdate();
            desconectar();

            return ("\n Exclusao realizada com sucesso!!!\n");
        } catch (Exception erro) {
            return ("- Erro " + erro.getMessage());
        }
    }

    public Usuario consultarUsuario(int id) {

        Usuario us = null;
        try {
            conectar();
            String query = "SELECT * FROM tb_Usuario WHERE id_Usuario = " + id + ";";
            PreparedStatement pesquisa = conexao.prepareStatement(query);
            ResultSet resultado = pesquisa.executeQuery();

            while (resultado.next()) {
                us = new Usuario();
                us.setId(resultado.getInt("id_Usuario"));
                us.setNome(resultado.getString("nome"));
                us.setEmail(resultado.getString("email"));
            }
            desconectar();
            return us;
        } catch (Exception erro) {
            us = new Usuario();
            us.setNome("Erro " + erro.getMessage());
            return us;
        }
    }*/
}

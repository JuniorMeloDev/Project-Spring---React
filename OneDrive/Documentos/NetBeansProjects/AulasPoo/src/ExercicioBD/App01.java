
package ExercicioBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App01 {

    public static void main(String[] args) {

        try {
            // MySQL
            String url = "jdbc:mysql://localhost:3306/db_unitaulas";

            // SqlServer
            // String url = "jdbc:sqlserver://localhost:1433;databaseName=db_unitaulas";	
            // Cria o objeto com a conexão com o BD
            Connection conexao = DriverManager.getConnection(url, "root", "05Peitickman");

            // Cria o objeto com a instrução SQL
            PreparedStatement pesquisa = conexao.prepareStatement("SELECT * FROM tb_Usuario");

            // Cria um objeto com o conjunto de resultados de uma tabela 
            ResultSet resultado = pesquisa.executeQuery();

            while (resultado.next()) {
                String nome = resultado.getString("nome");
                String email = resultado.getString("email");

                System.out.printf("\nNome: %-20S  E-mail: %-30S", nome, email);
            }
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("SQLException : " + ex.getMessage());
            System.out.println("SQLState     : " + ex.getSQLState());
            System.out.println("VendorError  : " + ex.getErrorCode());
        } catch (Exception erro) {
            System.out.println("Erro " + erro.getMessage());
        }

    }

}

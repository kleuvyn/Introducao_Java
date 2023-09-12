import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestListagem {


        public static void main(String[] args) throws SQLException {

            Conector conectar = new Conector();
            Connection connection = conectar.Estabelecer();

            Statement stm = connection.createStatement();
            stm.execute("SELECT PRODUTO, NOME, PRECO_LISTA FROM tbPRODUTO");

            ResultSet rst =stm.getResultSet();

            while(rst.next()) {
                System.out.println();
                String produto = rst.getString("PRODUTO");
                System.out.println(produto);
                String nome = rst.getString("NOME");
                System.out.println(nome);
                Float preco = rst.getFloat("PRECO_LISTA");
                System.out.println(preco);

            }

            connection.close();
        }
    }


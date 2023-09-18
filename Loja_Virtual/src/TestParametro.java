import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class TestParametro {

    public static void main(String[] args) throws SQLException {

        String PRODUTO  = "026856";
        String NOME = "Cola";
        Float PRECO_LISTA = 5.33f;
        Conector estabelecer = new Conector();
        Connection connection = estabelecer.conexao();

        PreparedStatement stm =
                connection.prepareStatement ("INSERT INTO  tbPRODUTO (PRODUTO, NOME, PRECO_LISTA) VALUES ( ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

        stm.setString(1, PRODUTO);
        stm.setString(2, NOME);
        stm.setFloat(3, PRECO_LISTA);

        stm.execute();


        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()) {
            String produto = rst.getString(1);
            System.out.println("O produto criado foi: " + produto);

        }

    }
}
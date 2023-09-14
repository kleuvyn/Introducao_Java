import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsercaco {
    public static void main(String[] args) throws SQLException {

        Conector conectar = new Conector();
        Connection connection = conectar.Estabelecer();

        Statement stm = connection.createStatement();
        stm.execute("INSERT INTO  tbPRODUTO (PRODUTO, NOME, PRECO_LISTA) VALUES ('1000314', 'Test tes', '8.99')",
                 Statement.RETURN_GENERATED_KEYS);

        ResultSet rst = stm.getGeneratedKeys();
        while(rst.next()) {


            String produto = rst.getString("PRODUTO");
            String nome = rst.getString("NOME");
            Float preco = rst.getFloat("PRECO_LISTA");

            System.out.println();
            System.out.println(produto);
            System.out.println(nome);
            System.out.println(preco);
        }
    }
}

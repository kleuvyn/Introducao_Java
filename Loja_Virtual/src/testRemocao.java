import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testRemocao {

    public static void main(String[] args) throws SQLException {

        Conector estabelecer = new Conector();
        Connection connection = estabelecer.conexao();
        Statement stm = connection.createStatement();

        stm.execute("DELETE FROM tbPRODUTO WHERE PRODUTO IN ('1000314', '1000335', '1000354')");

        Integer linhasModificadas = stm.getUpdateCount();
        System.out.println("Quantidade de linhas que foram modificadas " + linhasModificadas);

    }
}
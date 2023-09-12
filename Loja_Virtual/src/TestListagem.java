import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestListagem {


        public static void main(String[] args) throws SQLException {
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/SUCOS?useTimezone=true&serverTimezone=UTC", "admin", "password");

            Statement stm = con.createStatement();
            boolean resultado  = stm.execute("SELECT NOME, TAMANHO, EMBALAGEM, PRODUTO, SABOR  FROM tbPRODUTO");

            System.out.println(resultado);


            con.close();
        }
    }


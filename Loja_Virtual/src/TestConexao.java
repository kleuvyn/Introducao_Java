import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexao {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/SUCOS?useTimezone=true&serverTimezone=UTC", "admin", "password");
        System.out.println("Fechando conexão!!");

        connection.close();
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector{

    public Connection conexao() throws SQLException {
       return DriverManager
                .getConnection("jdbc:mysql://localhost:3306/SUCOS?useTimezone=true&serverTimezone=UTC", "admin", "password");

    }
}

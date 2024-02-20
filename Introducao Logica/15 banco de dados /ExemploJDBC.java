import java.sql.*;

public class ExemploJDBC {
/*
 * O JDBC é uma API padrão do Java que fornece uma maneira de se conectar a um banco de dados, enviar consultas SQL e processar os resultados. Com o JDBC, você pode interagir com qualquer banco de dados relacional compatível com SQL.
 */

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meubanco", "usuario", "senha");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tabela");

            while (rs.next()) {
                System.out.println(rs.getString("coluna"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

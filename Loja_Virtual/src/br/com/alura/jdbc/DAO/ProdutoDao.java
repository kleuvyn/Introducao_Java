package br.com.alura.jdbc.DAO;
import br.com.alura.jdbc.modelo.Produto;
import java.beans.PersistenceDelegate;
import java.sql.*;

public class ProdutoDao {

    private Connection connection;

    public ProdutoDao(Connection connection) {
        this.connection = connection;

    }

    public void salvarProduto(Produto produto) throws SQLException {

        String sql = "INSERT INTO  tbPRODUTO (PRODUTO, NOME, PRECO_LISTA) VALUES(?, ?, ? )";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, produto.getPRODUTO());
            preparedStatement.setString(2, produto.getNOME());
            preparedStatement.setFloat(3, produto.getPRECO_LISTA());

            preparedStatement.execute();

            try (ResultSet rst = preparedStatement.getGeneratedKeys()) {
                while (rst.next()) {
                    produto.setProduto(rst.getString(1));

                }
            }

        }
    }
}

package br.com.alura.jdbc.modelo;

import br.com.alura.jdbc.Conector;

import java.sql.*;

public class TestInsercaoComProduto {

    public TestInsercaoComProduto() {
    }

    public static  void main(String[] args) throws SQLException {

        Produto produto = new Produto("569824", "Água com gas 500Ml", 1.39);

        try (Connection connection = new Conector().conexao()) {
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
        System.out.println(produto);

    }
}

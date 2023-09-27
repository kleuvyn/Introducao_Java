package br.com.alura.jdbc.modelo;

import br.com.alura.jdbc.Conector;
import br.com.alura.jdbc.DAO.ProdutoDao;

import java.sql.*;

public class TestInsercaoComProduto {

    public TestInsercaoComProduto() {
    }

    public static  void main(String[] args) throws SQLException {

        Produto produto = new Produto("569824", "Água com gas 500Ml", 1.39);

        try (Connection connection = new Conector().conexao()) {
            ProdutoDao produtoDao = new ProdutoDao(connection);
            produtoDao.salvarProduto(produto);
            //Listar = persistenciaProduto.listar();
        }
    }
}

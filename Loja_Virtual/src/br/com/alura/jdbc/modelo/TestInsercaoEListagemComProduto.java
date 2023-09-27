package br.com.alura.jdbc.modelo;

import br.com.alura.jdbc.Conector;
import br.com.alura.jdbc.DAO.ProdutoDao;
import java.sql.*;
import java.util.List;

public class TestInsercaoEListagemComProduto {

    public TestInsercaoEListagemComProduto() {
    }

    public static  void main(String[] args) throws SQLException {

        Produto produto = new Produto("569824", "Água com gas 500Ml", 1.39f);

        try (Connection connection = new Conector().conexao()) {
            ProdutoDao produtoDao = new ProdutoDao(connection);
            produtoDao.salvarProduto(produto);
            List<Produto> listaDeProdduto = produtoDao.listar();
            listaDeProdduto.stream().forEach(lp -> System.out.println(lp));

        }
    }
}

package br.com.alura.jdbc.modelo;

import br.com.alura.jdbc.Conector;
import br.com.alura.jdbc.DAO.CategoriaDao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestCategorias {
    public static void main(String[] args) throws SQLException {

        try (Connection connection = new Conector().conexao()) {
            CategoriaDao categoriaDao = new CategoriaDao(connection);
            List<Categoria> listaCategoria = categoriaDao.listar();
            listaCategoria.stream().forEach(ct -> System.out.println(ct.getNome()));
        }

    }
}

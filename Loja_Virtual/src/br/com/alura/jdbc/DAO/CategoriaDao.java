package br.com.alura.jdbc.DAO;

import br.com.alura.jdbc.modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDao {

    private final Connection connection;

    public CategoriaDao(Connection connection) {
        this.connection = connection;

    }

    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT Id, Nome FROM tbCATEGORIA";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.execute();

            try(ResultSet rst = preparedStatement.getResultSet()){
                while (rst.next()){
                    Categoria categoria = new Categoria(rst.getInt(1), rst.getString(2));

                    categorias.add(categoria);
                }

            }


        }
        return categorias;
        }
    }

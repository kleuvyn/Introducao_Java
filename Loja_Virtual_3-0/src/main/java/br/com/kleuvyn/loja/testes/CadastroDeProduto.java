package br.com.kleuvyn.loja.testes;

import br.com.kleuvyn.loja.dao.ProdutoDao;
import br.com.kleuvyn.loja.modelo.Categoria;
import br.com.kleuvyn.loja.modelo.Produto;
import br.com.kleuvyn.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Categoria celulares = new Categoria ("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "Note 12", new BigDecimal("1299.99"), celulares);

        EntityManager em = JPAUtil.getEntityManeger();

        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();
        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);

        System.out.println("### "+celular.getId());
        em.getTransaction().commit();
        em.close();
    }
}

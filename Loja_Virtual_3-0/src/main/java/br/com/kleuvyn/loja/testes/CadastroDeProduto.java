package br.com.kleuvyn.loja.testes;

import br.com.kleuvyn.loja.dao.ProdutoDao;
import br.com.kleuvyn.loja.modelo.Categoria;
import br.com.kleuvyn.loja.modelo.Produto;
import br.com.kleuvyn.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Produto celular = new Produto("Xiaomi Redmi", "Note 12", new BigDecimal("1299.99"), Categoria.CELULARES);

        EntityManager em = JPAUtil.getEntityManeger();
        ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();
        em.persist(celular);
        System.out.println("### "+celular.getId());
        em.getTransaction().commit();
        em.close();
    }
}

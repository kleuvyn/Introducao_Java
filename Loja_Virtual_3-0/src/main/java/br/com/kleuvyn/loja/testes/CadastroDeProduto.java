package br.com.kleuvyn.loja.testes;

import br.com.kleuvyn.loja.dao.ProdutoDao;
import br.com.kleuvyn.loja.modelo.Produto;
import br.com.kleuvyn.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Produto celular = new Produto();
        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Note 12");
        celular.setPreco(new BigDecimal("1299.99"));

        EntityManager em = JPAUtil.getEntityManeger();
        ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();
        em.persist(celular);
        System.out.println("### "+celular.getId());
        em.getTransaction().commit();
        em.close();
    }
}

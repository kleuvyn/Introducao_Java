package br.com.kleuvyn.loja.dao;

import br.com.kleuvyn.loja.modelo.Categoria;

import javax.persistence.EntityManager;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }
    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }
}

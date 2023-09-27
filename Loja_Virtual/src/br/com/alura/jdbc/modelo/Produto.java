package br.com.alura.jdbc.modelo;

public class Produto {

    private String produto;
    private String nome;
    private  Float preco_lista;

    public Produto(String produto, String nome, Float preco_lista) {
        super();
        this.produto = produto;
        this.nome = nome;
        this.preco_lista = preco_lista;

    }

    public void setProduto(String produto) {
        this.produto = this.produto;

    }

    public String getProduto() {
        return produto;

    }
    public String getNome() {
        return nome;

    }
    public Float getPreco_lista() {
        return preco_lista;

    }

    public String toString(){
        return String.format("O produto criado é: %s, %s, %.2f",
                this.produto, this.nome, this.preco_lista);

    }
}

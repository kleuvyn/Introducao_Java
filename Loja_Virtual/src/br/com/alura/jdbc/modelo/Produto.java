package br.com.alura.jdbc.modelo;

public class Produto {

    private String PRODUTO;
    private String NOME;
    private  Float PRECO_LISTA;

    public Produto(String number, String s, double v) {
        super();
        this.PRODUTO = PRODUTO;
        this.NOME = NOME;
        this.PRECO_LISTA = PRECO_LISTA;

    }

    public String getPRODUTO() {
        return PRODUTO;
    }
    public String getNOME() {
        return NOME;
    }
    public Float getPRECO_LISTA() {
        return PRECO_LISTA;
    }


    public void setProduto(String string) {
    }

    public String toString(){
        return String.format("O produto criado foi: %, %, %",
                this.PRODUTO, this,NOME, this.PRECO_LISTA);
    }
}

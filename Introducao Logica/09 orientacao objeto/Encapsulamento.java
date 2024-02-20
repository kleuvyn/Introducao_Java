public class Encapsulamento {
    /*
     encapsulamento refere-se à prática de ocultar os detalhes de implementação dos objetos e expor apenas uma interface pública. Isso é alcançado através do uso de modificadores de acesso como public, private e protected, para controlar o acesso aos atributos e métodos de uma classe.
    */

    // CARRO
    private String marca;
    private String modelo;
    private int ano;

    // Métodos getters e setters para acessar e modificar os atributos de forma controlada
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

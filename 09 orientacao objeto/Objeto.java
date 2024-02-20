public class Objeto {
    /*
    Classes: Em Java, uma classe é uma estrutura que define os atributos e métodos comuns a um tipo de objeto. Por exemplo, se estivermos criando um programa para gerenciar carros, poderíamos ter uma classe chamada "Carro" que define os atributos como marca, modelo, cor, e métodos como ligar, desligar, acelerar, etc.

    Objetos: Um objeto é uma instância de uma classe. Podemos criar vários objetos a partir de uma mesma classe. Por exemplo, podemos criar um objeto "carro1" e um objeto "carro2" a partir da classe "Carro".

    Atributos: Os atributos são as características dos objetos. Eles representam o estado do objeto. Por exemplo, em uma classe "Carro", os atributos poderiam ser marca, modelo, cor, etc.

    Métodos: Os métodos são as ações que os objetos podem realizar. Eles definem o comportamento dos objetos. Por exemplo, em uma classe "Carro", os métodos poderiam ser ligar, desligar, acelerar, etc.
     */
    // LIVRO
    private String titulo;
    private String autor;
    private int numPaginas;
    
    // Construtor
    public Livro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    // Métodos getters e setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}

public class Heranca {
    /*
     Herança permite que uma classe (subclasse) herde os atributos e métodos de outra classe (superclasse). Isso promove a reutilização de código e a organização hierárquica de classes. Por exemplo, uma classe "SUV" poderia herdar da classe "Carro" todas as características comuns a um carro, adicionando características específicas de um SUV. 
    */

    // ANIMAL
    public void emitirSom() {
        System.out.println("Animal fazendo barulho...");
    }
}

public class Cachorro extends Animal {
    // Sobrescrevendo o método emitirSom() na subclasse Cachorro
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}


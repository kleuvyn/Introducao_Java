public class Polimorfismo {
    /*
    Polimorfismo refere-se à capacidade de um objeto poder se comportar de diferentes maneiras. Isso pode ser alcançado através de sobrescrita de métodos (métodos com o mesmo nome em classes diferentes) e sobrecarga de métodos (métodos com o mesmo nome, mas com diferentes parâmetros na mesma classe).
    */

    // ANIMAL
    public void emitirSom() {
        System.out.println("Animal fazendo barulho...");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }
}

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();

        animal1.emitirSom(); // Produz: "Au Au!"
        animal2.emitirSom(); // Produz: "Miau!"
    }
}

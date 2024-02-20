public class Funcao {
    // Definindo um método que recebe dois números inteiros e retorna a soma deles
    public static int somar(int a, int b) {
        return a + b;
    }

    // Método principal onde o programa começa a execução
    public static void main(String[] args) {
        // Chamando o método somar e armazenando o resultado em uma variável
        int resultado = somar(5, 3);
        System.out.println("O resultado da soma é: " + resultado);
    }
}

public class EstruturaRepeticao {
    /*
    Estrutura while: Executa um bloco de código enquanto uma condição especificada for verdadeira.
    Estrutura do-while: Executa um bloco de código uma vez e, em seguida, repete a execução enquanto uma condição especificada for verdadeira.
    Estrutura for: Executa um bloco de código um número específico de vezes, definido por uma inicialização, uma condição de término e uma expressão de incremento.
     */
    
    public class EstruturaRepeticao {
        public static void main(String[] args) {
            // Exemplo de estrutura while
            System.out.println("Exemplo de estrutura while:");
            int contador = 1;
            while (contador <= 5) {
                System.out.println("Contador: " + contador);
                contador++;
            }
    
            // Exemplo de estrutura do-while
            System.out.println("\nExemplo de estrutura do-while:");
            int contador2 = 1;
            do {
                System.out.println("Contador: " + contador2);
                contador2++;
            } while (contador2 <= 5);
    
            // Exemplo de estrutura for
            System.out.println("\nExemplo de estrutura for:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Contador: " + i);
            }
        }
    }
    
}

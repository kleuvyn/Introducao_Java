public class EstruturaDecisao {
    public class EstruturaDecisao {
        public static void main(String[] args) {
            int idade = 20;
    
            // Exemplo de estrutura if
            System.out.println("Exemplo de estrutura if:");
            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            }
    
            // Exemplo de estrutura if-else
            System.out.println("\nExemplo de estrutura if-else:");
            if (idade >= 18) {
                System.out.println("Você é maior de idade.");
            } else {
                System.out.println("Você é menor de idade.");
            }
    
            // Exemplo de estrutura if-else if-else
            System.out.println("\nExemplo de estrutura if-else if-else:");
            if (idade < 13) {
                System.out.println("Criança.");
            } else if (idade < 18) {
                System.out.println("Adolescente.");
            } else {
                System.out.println("Adulto.");
            }
    
            // Exemplo de operador ternário
            System.out.println("\nExemplo de operador ternário:");
            String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
            System.out.println("Status: " + status);
        }
    }
    
    
}

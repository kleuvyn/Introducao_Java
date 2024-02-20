public class EstruturasCondicionais {
    public static void main(String[] args) {
        /*    
        Estrutura if-else: Verifica uma condição e executa um bloco de código se a condição for verdadeira, caso contrário, executa outro bloco de código.

        Estrutura if-else if-else: Verifica várias condições em sequência e executa o bloco de código correspondente à primeira condição verdadeira. Se nenhuma condição for verdadeira, executa o bloco de código no else.

        Operador ternário: Uma forma abreviada de escrever uma estrutura condicional que avalia uma expressão booleana e retorna um valor com base nessa avaliação. 
        */

        int idade = 18;

        // Estrutura if-else
        System.out.println("Estrutura if-else:");
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Estrutura if-else if-else
        System.out.println("\nEstrutura if-else if-else:");
        if (idade < 13) {
            System.out.println("Criança.");
        } else if (idade < 18) {
            System.out.println("Adolescente.");
        } else {
            System.out.println("Adulto.");
        }

        // Operador ternário
        System.out.println("\nOperador ternário:");
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Status: " + status);
    }
}

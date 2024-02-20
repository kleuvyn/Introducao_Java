public class Operadores {
    public static void main(String[] args) {

        // Operadores Aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Operadores Aritméticos:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto);

        // Operadores de Atribuição
        int x = 10;
        x += 5; // Equivalente a: x = x + 5;
        System.out.println("\nOperadores de Atribuição:");
        System.out.println("x += 5: " + x);

        // Operadores de Incremento e Decremento
        int y = 5;
        y++; // Incremento
        int z = 10;
        z--; // Decremento
        System.out.println("\nOperadores de Incremento e Decremento:");
        System.out.println("y++: " + y);
        System.out.println("z--: " + z);

        // Operadores Relacionais
        int num1 = 10;
        int num2 = 20;
        System.out.println("\nOperadores Relacionais:");
        System.out.println("num1 == num2: " + (num1 == num2));
        System.out.println("num1 != num2: " + (num1 != num2));
        System.out.println("num1 < num2: " + (num1 < num2));
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 <= num2: " + (num1 <= num2));
        System.out.println("num1 >= num2: " + (num1 >= num2));

        // Operadores Lógicos
        boolean p = true;
        boolean q = false;
        System.out.println("\nOperadores Lógicos:");
        System.out.println("p && q: " + (p && q)); // E lógico
        System.out.println("p || q: " + (p || q)); // OU lógico
        System.out.println("!p: " + (!p)); // Negação lógica
    }
}

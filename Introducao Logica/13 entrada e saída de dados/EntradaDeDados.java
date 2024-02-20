import java.util.Scanner;
// Para ler dados do teclado, você pode usar a classe Scanner do pacote java.util

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        scanner.close();
    }
}

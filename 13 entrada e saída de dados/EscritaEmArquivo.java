import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaEmArquivo {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt"))) {
            bw.write("Hello, world!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}

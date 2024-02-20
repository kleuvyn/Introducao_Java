// import.io.IOException;

public class Excecoes {
   /*
   *Exceções:

    Uma exceção é um evento que interrompe o fluxo normal de execução de um programa devido a algum erro ou condição anormal.
    Exemplos de exceções incluem: NullPointerException, ArithmeticException, FileNotFoundException, entre outras.

    *Blocos try-catch:

    O tratamento de exceções é feito usando blocos try e catch.
    O código que pode gerar uma exceção é colocado dentro do bloco try.
    Se ocorrer uma exceção dentro do bloco try, o controle do programa é transferido para o bloco catch, onde você pode lidar com a exceção de forma apropriada.
    */


try {
    // Código que pode gerar uma exceção
    int resultado = dividir(10, 0);
} catch (ArithmeticException e) {
    // Tratamento da exceção
    System.out.println("Erro ao dividir por zero: " + e.getMessage());
}

    /*
    *Bloco finally:

    O bloco finally é opcional e é usado para definir código que deve ser executado independentemente de ocorrer uma exceção ou não.
    Geralmente, é usado para liberar recursos, como fechar arquivos ou conexões de banco de dados.

    */

try {
    // Código que pode gerar uma exceção
    // Abre um arquivo
} catch (IOException e) {
    // Tratamento da exceção
    // Fecha o arquivo, garantindo que será fechado mesmo se ocorrer uma exceção
} finally {
    
}
        
if (saldo < 0) {
    throw new SaldoNegativoException("Saldo não pode ser negativo");
}

/*
        *Lançamento de exceções:

            Você também pode lançar exceções manualmente usando a palavra-chave throw.
            Isso é útil quando você quer indicar um erro específico em seu código.
        */
}
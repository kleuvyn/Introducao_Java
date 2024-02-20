public class Variaveis {
    public static void main(String[] args) {

        /*
        *Regras para Nomes de Variáveis:
        Nomes de variáveis devem começar com uma letra, seguida de letras, números ou sublinhados.
        Não podem conter espaços e não devem ser palavras reservadas da linguagem.
        *Java é sensível a maiúsculas e minúsculas, então idade e Idade são consideradas variáveis diferentes.

        * Declaração de Variáveis:
        Para criar uma variável, você precisa declará-la, especificando o tipo de dado e um nome.
        * Inicialização de Variáveis:
        Após declarar uma variável, você pode atribuir um valor a ela, isso é chamado de inicialização.
        */

        // *Declarando e inicializando variáveis
        int idade = 30;// Declara uma variável do tipo inteiro chamada "idade".Inicializa a variável "idade" com o valor 30
        double altura = 1.75;// Declara uma variável do tipo double chamada "altura".Inicializa a variável "altura" com o valor 1.75
        char letra = 'A'; // Inicializa a variável "letra" com o caractere 'A'. Inicializa a variável "letra" com o caractere 'A'
        boolean estaChovendo = true; // Declara uma variável do tipo boolean chamada "estaChovendo".Inicializa a variável "estaChovendo" com o valor verdadeiro (true)

        // *Imprimindo os valores das variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Letra: " + letra);
        System.out.println("Está chovendo?:" + estaChovendo);

    }
    
}
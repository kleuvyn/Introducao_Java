public class Concatenacao {
// Concatenação de Strings:
// Para concatenar (ou juntar) duas ou mais strings em Java, você pode usar o operador + ou o método concat().

String nome = "Alice";
String sobrenome = "Silva";
String nomeCompleto = nome + " " + sobrenome;
// Ou
String nomeCompleto2 = nome.concat(" ").concat(sobrenome);

// Tamanho da String:
// Para obter o tamanho de uma string (o número de caracteres que ela contém), você pode usar o método length().

String texto = "Hello, world!";
int tamanho = texto.length(); // Retorna 13

// Acesso a Caracteres Individuais:
// Você pode acessar caracteres individuais em uma string usando o método charAt().

String palavra = "Java";
char primeiroCaractere = palavra.charAt(0); // Retorna 'J'

// Substrings:
// Você pode obter uma substring (ou parte) de uma string usando o método substring().

String frase = "O Java é uma linguagem poderosa";
String parte = frase.substring(2, 6); // Retorna "Java"

// Divisão de Strings:
// Você pode dividir uma string em substrings com base em um caractere de delimitação usando o método split().

String dados = "João,Silva,30";
String[] partes = dados.split(",");
// Agora partes[0] é "João", partes[1] é "Silva" e partes[2] é "30"

// Transformação de Maiúsculas e Minúsculas:
// Você pode converter uma string para maiúsculas ou minúsculas usando os métodos toUpperCase() e toLowerCase().

String texto = "Exemplo";
String maiusculas = texto.toUpperCase(); // Retorna "EXEMPLO"
String minusculas = texto.toLowerCase(); // Retorna "exemplo"
    
}

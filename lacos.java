public class lacos {
        //Laços//
        //Os laços (também conhecidos como loops) são usados para executar um bloco de código repetidamente
        //enquanto uma condição especificada for verdadeira, ou para percorrer uma sequência de elementos.
        //Os laços mais comuns são "for" (para), "while" (enquanto) e "do-while" (faça-enquanto).

    public static void main(String[] args) {
        //testeWhile();
        //testeWhile2();
        testeFor();
    }

    public static void testeWhile() {
        //Laço "while":

        int contador = 0;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
            //contador = contador + 1;
            //contador += 1;
        }
        System.out.println(contador);
    }

    public static void testeWhile2() {
        int contador = 0;
        int total = 0;

        while (contador <= 100){
            total += contador;
            //total = total + contador;

            System.out.println(total);
            contador++;
        }

    }


}

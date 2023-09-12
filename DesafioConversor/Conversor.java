public class Conversor {
    public static void main(String[] args) {

        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Digite o valor em dólares americanos: ");
            String input = br.readLine();
            double valorDOLAR = Double.parseDouble(input);


            double taxaCambio = 4.92;


            double valorREAL = valorDOLAR * taxaCambio;

            System.out.println(valorDOLAR + " DOLAR  equivalem a " + valorREAL + " REAL.");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}



public class Principal {
    public static void main(String[] args) {
        IMoeda moeda = new Euro();
        double valorDeUmEuroEmReais = moeda.getValorUnitarioEmReal();
    }
}
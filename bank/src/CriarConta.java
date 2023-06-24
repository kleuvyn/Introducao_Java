public class CriarConta {
    public static void main(String[] args) {
     Conta primeiraConta =  new Conta();
     primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);
        System.out.println(primeiraConta.titular);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println(segundaConta.saldo);

        Conta terceiraConta = new Conta();
        terceiraConta.saldo = 300;
        System.out.println(terceiraConta.saldo);

        //test01
        Conta contaKleuvyn = new Conta();
        contaKleuvyn.saldo = 100;
        contaKleuvyn.depositar(50);
        System.out.println(contaKleuvyn.saldo);
        //test02
        boolean conseguiuSacar =contaKleuvyn.sacar(20);
        System.out.println(contaKleuvyn.saldo);
        System.out.println(conseguiuSacar);







    }

   }

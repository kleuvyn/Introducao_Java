public class SistemaInterno {

    private int senha = 2222;

    public void autentica(FincionarioAutentificacao funau){
        boolean autenticou =  funau.autentica(this.senha);
        if (autenticou) {
            System.out.println("\nSistema Liberado!\n");

        }else{
            System.out.println("  !!!ERRO!!!\nSENHA INCORRETA");


        }

    }

}

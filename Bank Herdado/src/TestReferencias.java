public class TestReferencias {

    public static void main(String[] args) {

        Gerente gr01 = new Gerente();
        gr01.setNome("Miguel Silva");
        gr01.setCpf(987456123);
        gr01.setSalario(6500.00);
        gr01.getBonificacao();


        System.out.println("Nome: " + gr01.getNome() + "\nCPF: " + gr01.getCpf() + "\nSalario: " + gr01.getSalario() + "\nBonificação: " + gr01.getBonificacao());

        gr01.setSenha(0306);
        boolean autenticou = gr01.autentica(0306);

        System.out.println("Senha: " + autenticou);
}

}

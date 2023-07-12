public class ControleBonificacao {

    private  double soma;

    public void registra(Gerente g){

        double bon = g.getBonificacao();
        this.soma = this.soma + bon;
    }
}

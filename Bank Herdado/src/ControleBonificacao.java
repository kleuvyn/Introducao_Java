public class ControleBonificacao {

    private  double soma;

    public void registra(Gerente g){

        double bon = g.getBonificacao();
        this.soma = this.soma + bon;
    }
    public void registra(Funcionario fun){

        double bon = fun.getBonificacao();
        this.soma = this.soma + bon;
    }

    public void registra(EditorVideo editorv){

        double bon = editorv.getBonificacao();
        this.soma = this.soma + bon;
    }

    public double getSoma() {
        return soma;
    }
}

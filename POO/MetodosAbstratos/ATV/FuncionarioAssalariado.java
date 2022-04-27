package POO.MetodosAbstratos.ATV;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String matricula, double salarioSemanal){
        super(nome,matricula);
        this.salarioSemanal = salarioSemanal;
    }

    public double ganhos(){
        double ganhos = this.salarioSemanal;
        return ganhos;
    }

    public double getSalarioSemanal() {
        return this.salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    Public String toString(){
        String informacoes = super.toString() + "\nGanhos: "+ganhos();
        return informacoes;
    }

}

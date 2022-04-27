package POO.MetodosAbstratos.ATV;

public class FuncionarioHora extends FuncionarioAssalariado {
    private int horas;
    private double valorDaHora;

    public FuncionarioHora(String nome, String matricula, double salarioSemanal, int horas, double valorDaHora){
        super(nome, matricula, salarioSemanal)
        this.horas = horas;
        this.valorDaHora = valorDaHora;
    }

    public int getHoras() {
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorDaHora() {
        return this.valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }

    public double ganhos(){
        double ganhos = this.getSalarioSemanal() + (this.horas * this.valorDaHora);
        return ganhos;
    }

    public String toString() {
        String informacoes = super.toString()+"\nHoras Trabalhadas: "+horas+"\nValor da Hora: "+valorDaHora+"\nGanhos: "+ganhos();
        return informacoes;
    };


}

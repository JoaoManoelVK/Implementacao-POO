package POO.MetodosAbstratos.ATV;

public class FuncionarioComissionado extends Funcionario {
    private int quantidadedeVendas;
    private double valorPorVenda;
   
    public Funcionario(String nome, String matricula,int quantidadedeVendas, double valorPorVenda) {
        super(nome, matricula);
        this.quantidadedeVendas = quantidadedeVendas;
        this.valorPorVenda = valorPorVenda; 
    }

    public double ganhos(){
        double ganhos = this.quantidadedeVendas * this.valorPorVenda;
        return ganhos;
    }

    public int getQuantidadedeVendas() {
        return this.quantidadedeVendas;
    }

    public void setQuantidadedeVendas(int quantidadedeVendas) {
        this.quantidadedeVendas = quantidadedeVendas;
    }

    public double getValorPorVenda() {
        return this.valorPorVenda;
    }

    public void setValorPorVenda(double valorPorVenda) {
        this.valorPorVenda = valorPorVenda;
    }
    
    Public String toString(){
        String informacoes = super.toString() + "\nQuantidade de Vendas: "+quantidadedeVendas+"\nValor por venda: "+valorPorVenda+"\nGanhos Totais: "+ganhos();
    }
}

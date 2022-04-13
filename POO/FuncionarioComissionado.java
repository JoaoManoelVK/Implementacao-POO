package POO;

public class FuncionarioComissionado extends Funcionario{
    private double comissao;
    private int vendas;

    public FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario){
        //Funcionario Comissionado herda as variaveis de Funcionario por meio do Super 
        super(primeiro_nome, segundo_nome, salario);
    }

    //Getters and Setters
    public double getComissao() {
        return this.comissao;
    }

    //SetComissao é modificado para receber quantidade de vendas alem do valor das comissões
    public void setComissao(double comissao,int quantidade) {
        
        //Verificação de zero ou numero negativo
        if (quantidade <= 0 || comissao <= 0) {
            System.out.println("Numero invalido");
        }else{
            //Caso não seja zero ou negativo é repassado para a variavel
            this.comissao += comissao;
            this.vendas += quantidade;
        }
        
    }

    public int getVendas() {
        return this.vendas;        
    }
    
    public String toString(){
        //FuncionarioComissionado Herda com super o metodo toString de Funcionario
        String pagamento = super.toString()+" E recebera de comissão por "+vendas+" vendas:R$"+comissao;
        return pagamento;
    }
    
}

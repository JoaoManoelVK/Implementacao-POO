package POO.Herança;

public class FuncionarioMain {
    
    public static void main(String[] args) {
            
        //Objeto Funcionario e Funcionario Comissionado
        Funcionario funcionario = new Funcionario("Carlos", "Almeida", 1000);
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Elias", "Alcantra", 500);

        //Comissão do Funcionario Comissionado, preço e vendas
        funcionarioComissionado.setComissao(1200);
        funcionarioComissionado.setComissao(400);
        funcionarioComissionado.setVendas(3);
        funcionarioComissionado.setVendas(1);

        //Comissão e Vendas não podendo ser negativa ou zero 
        funcionarioComissionado.setComissao(0);
        funcionarioComissionado.setVendas(0);

        //Get Vendas faz um controle de quantas vendas o Funcionario fez
        System.out.println(funcionarioComissionado.getVendas());

        //toString mostrando as informações, sendo que FuncionarioComissionado herda o toString de Funcionario
        System.out.println(funcionario.toString());
        System.out.println(funcionarioComissionado.toString());
    }
}

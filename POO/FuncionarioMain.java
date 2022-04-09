package POO;

public class FuncionarioMain {
    
    public static void main(String[] args) {
        
        //Objeto Funcionario e Funcionario Comissionado
        Funcionario funcionario = new Funcionario("Carlos", "Almeida", 1000);
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Elias", "Alcantra", 500);

        //Comissão do Funcionario Comissionado, preço e quantidade
        funcionarioComissionado.setComissao(1200, 3);
        funcionarioComissionado.setComissao(400, 1);

        //Comissão não podendo ser negativa ou zero tanto em comissão quanto quantidade
        funcionarioComissionado.setComissao(1000, 0);
        funcionarioComissionado.setComissao(0, 1);
        funcionarioComissionado.setComissao(0, 0);

        //Get Vendas faz um controle de quantas vendas o Funcionario fez
        System.out.println(funcionarioComissionado.getVendas());

        //toString mostrando as informações, sendo que FuncionarioComissionado herda o toString de Funcionario
        System.out.println(funcionario.toString());
        System.out.println(funcionarioComissionado.toString());
    }
}

package POO.MetodosAbstratos.ATV;

import java.util.ArrayList;

public class FolhaDePagamentoApp {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João Manoel",231231);
        FuncionarioAssalariado funcionarioa = new FuncionarioAssalariado("Claudio", 4123, 1000);
        FuncionarioComissionado fComissionado = new FuncionarioComissionado("Pedro",12312,20,100);

        
        
        
        
        
        // ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        // funcionarios.add(FuncionarioAssalariado);
        // funcionarios.add(FuncionarioComissionado);
        // funcionarios.add(FuncionarioHora);
        // if(funcionarios.get(0) instanceof FuncionarioAssalariado){
        //     FuncionarioAssalariado funca1 = (FuncionarioAssalariado) funcionarios.get(0);
        // }
        // if(funcionarios.get(0) instanceof FuncionarioComissionado){
        //     FuncionarioComissionado funcc1 = (FuncionarioComissionado) funcionarios.get(0);
        // }
        // if(funcionarios.get(0) instanceof FuncionarioHora){
        //     FuncionarioHora funh1 = (FuncionarioHora) funcionarios.get(0);
        // }

    }
}

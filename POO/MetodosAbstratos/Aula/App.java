package POO.MetodosAbstratos.Aula;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Secretaria secretaria = new Secretaria();

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(secretaria);
        funcionarios.add(gerente)

        if(funcionarios.get(0) instanceof Secretaria){
            Secretaria sec1 = (Secretaria) funcionarios.get(0);
        }
    }
}

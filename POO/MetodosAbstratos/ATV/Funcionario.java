package POO.MetodosAbstratos.ATV;

public class Funcionario {
    private String nome;
    private String matricula;

    public class Funcionario(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String toString() {
        String informacoes = "Funcionario \nNome: "+nome+ "\nMatricula: "+matricula;
        return informacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public abstract ganhos();


}

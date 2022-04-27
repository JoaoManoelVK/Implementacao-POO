package POO.MetodosAbstratos.Aula;

import POO.Herança.Funcionario;

public abstract class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(){

    }
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract getSalario();

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}

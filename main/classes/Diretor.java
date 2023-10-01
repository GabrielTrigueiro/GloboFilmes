package main.classes;

public class Diretor implements Funcionario {
    private String nome;

    public Diretor(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getFuncao() {
        return "Diretor";
    }
}
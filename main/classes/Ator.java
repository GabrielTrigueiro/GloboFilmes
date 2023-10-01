package main.classes;

public class Ator implements Funcionario {
    private String nome;

    public Ator(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getFuncao() {
        return "Ator";
    }
}
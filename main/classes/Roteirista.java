package main.classes;

public class Roteirista implements Funcionario {
    private String nome;

    public Roteirista(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getFuncao() {
        return "Roteirista";
    }
}
package classes;

import java.util.ArrayList;

public abstract class Funcionario {
    private String nome;
    private ArrayList<FilmeTrabalhado> filmesTrabalhados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.filmesTrabalhados = new ArrayList<>();
    }

    public void adicionarFilmeFeito(String nome, String funcao){
        FilmeTrabalhado novoFilme = new FilmeTrabalhado(nome, funcao);
        filmesTrabalhados.add(novoFilme);
    }

    public void retornarFilmesTrabalhados(){
        for(FilmeTrabalhado filme : filmesTrabalhados){
            filme.participacao();
        }
    }

    public abstract void adicionarFilmeFeito(String nome);
}
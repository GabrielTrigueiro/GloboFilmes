import classes.*;

import java.util.ArrayList;
import java.util.List;

public class ControleDeAcesso {
    private ArrayList<Filme> filmes;
    public ControleDeAcesso() {
        this.filmes = new ArrayList<>();
    }

    //registrar filme
    public void registrarFilme(String nome, int ano, List<Ator> atores, Diretor diretor, Roteirista roteirista, Camera camera, TrilhaSonora trilhaSonora) {
        Filme novoFilme = new Filme(nome, ano, atores, diretor, roteirista, trilhaSonora, camera);
        diretor.adicionarFilmeFeito(novoFilme.getNome());
        roteirista.adicionarFilmeFeito(novoFilme.getNome());
        camera.adicionarFilmeFeito(novoFilme.getNome());
        for (Funcionario ator : atores) {
            ator.adicionarFilmeFeito(novoFilme.getNome());
        }
        filmes.add(novoFilme);
    }

    //retornar historico de trabalho
    public void consultarTrabalhos(Funcionario funcionario){
        System.out.println(funcionario.getNome() + " trabalhou nos filmes:");
        funcionario.retornarFilmesTrabalhados();
        System.out.println();
    }

    //mostrar filmes
    public void listarFilmes() {
        System.out.println("Filmes já feitos \n");
        for (Filme filme : filmes) {
            System.out.println(filme.getNome());
        }
    }

    //detalhar filme
    public void detalhesFilme(String nome){
        System.out.println();
        System.out.println("Detalhes do filme \n");
        for (Filme filme : filmes){
            if(filme.getNome().equals(nome)){
                System.out.println(filme.toString());
                break;
            }
        }
    }

}

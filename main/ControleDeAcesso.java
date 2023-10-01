package main;

import main.classes.Filme;
import main.classes.Funcionario;
import main.erros.FilmeNaoEncontradoException;
import main.erros.FuncionarioNaoEncontradoException;
import main.erros.RegistroFilmeException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ControleDeAcesso {
    private List<Filme> filmesFeitos;

    public ControleDeAcesso() {
        this.filmesFeitos = new ArrayList<>();
    }

    public void registrarFilme(String nome, int ano, Funcionario diretor, Funcionario roteirista, List<Funcionario> elenco) throws RegistroFilmeException {
        if (nome == null || nome.isEmpty()) {
            throw new RegistroFilmeException("Nome do filme é inválido.");
        }

        Set<Funcionario> pessoasEnvolvidas = new HashSet<>();
        pessoasEnvolvidas.add(diretor);
        pessoasEnvolvidas.add(roteirista);
        pessoasEnvolvidas.addAll(elenco);

        if (pessoasEnvolvidas.size() != (elenco.size() + 2)) {
            throw new RegistroFilmeException("Uma pessoa não pode ser designada para mais de um papel no filme.");
        }

        Filme novoFilme = new Filme(nome, ano, diretor, roteirista, elenco);
        filmesFeitos.add(novoFilme);
        System.out.println("Filme criado");
    }


    private Filme procurarFilmePorNome(String nome) {
        for (Filme filme : filmesFeitos) {
            if (filme.getNome().equals(nome)) {
                return filme;
            }
        }
        return null;
    }

    public void informacoesDoFilme(String nome) throws FilmeNaoEncontradoException {
        Filme filmeProcurado = procurarFilmePorNome(nome);
        if (filmeProcurado == null) {
            throw new FilmeNaoEncontradoException("Filme não encontrado: " + nome);
        }
        filmeProcurado.retornarFuncionarios();
    }

    public void retornarFilmografiaFuncionario(String nome) throws FuncionarioNaoEncontradoException {
        System.out.println();
        System.out.println("Histórico de " + nome);
        boolean encontrado = false;

        for (Filme filme : filmesFeitos) {
            List<Funcionario> elenco = filme.getElenco();
            for (Funcionario pessoa : elenco) {
                if (pessoa.getNome().equals(nome)) {
                    System.out.println("Filme - " + filme.getNome() + " - Ator");
                    encontrado = true;
                }
            }
            Funcionario diretor = filme.getDiretor();
            if (diretor.getNome().equals(nome)) {
                System.out.println("Filme - " + filme.getNome() + " - Diretor");
                encontrado = true;
            }
            Funcionario roteirista = filme.getRoteirista();
            if (roteirista.getNome().equals(nome)) {
                System.out.println("Filme - " + filme.getNome() + " - Roteirista");
                encontrado = true;
            }
        }

        if (!encontrado) {
            throw new FuncionarioNaoEncontradoException(nome);
        }
    }
}

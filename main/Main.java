package main;

import main.classes.*;
import main.erros.FilmeNaoEncontradoException;
import main.erros.FuncionarioNaoEncontradoException;
import main.erros.RegistroFilmeException;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws FuncionarioNaoEncontradoException, FilmeNaoEncontradoException, RegistroFilmeException {
        ControleDeAcesso controle = new ControleDeAcesso();

        Funcionario gabriel = new Ator("Gabriel");
        Funcionario daVinci = new Ator("Da vinci");
        Funcionario monalisa = new Ator("Monalisa");

        List<Funcionario> elencoOCanto= new ArrayList<>();
        elencoOCanto.add(gabriel);

        List<Funcionario> elencoOSetimoPassageiro = new ArrayList<>();
        elencoOSetimoPassageiro.add(daVinci);

        controle.registrarFilme("O canto", 2000, daVinci, monalisa, elencoOCanto);
        controle.registrarFilme("O sétimo passageiro", 2010,monalisa, gabriel, elencoOSetimoPassageiro);

        controle.informacoesDoFilme("O sétimo passageiro");
        controle.informacoesDoFilme("O canto");

        controle.retornarFilmografiaFuncionario("Da vinci");
        controle.retornarFilmografiaFuncionario("Monalisa");
        controle.retornarFilmografiaFuncionario("Gabriel");
    }
}
import classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControleDeAcesso controle = new ControleDeAcesso();

        Ator Gabriel = new Ator("Gabriel");
        Ator Guilherme = new Ator("Guilherme");
        Diretor David = new Diretor("David");
        Camera Nicolas = new Camera("Nicolas");
        Roteirista Sabrina = new Roteirista("Sabrina");
        TrilhaSonora Matheus = new TrilhaSonora("Matheus");


        List<Ator> atores = new ArrayList<>();
        atores.add(Gabriel);
        atores.add(Guilherme);

        controle.registrarFilme("Filme Legal", 2020, atores, David, Sabrina, Nicolas, Matheus);

        controle.registrarFilme("O Filme", 2020, atores, David, Sabrina, Nicolas, Matheus);

        controle.listarFilmes();

        controle.consultarTrabalhos(Gabriel);
        controle.consultarTrabalhos(Sabrina);
        controle.consultarTrabalhos(Nicolas);

        controle.detalhesFilme("O Filme");
    }
}

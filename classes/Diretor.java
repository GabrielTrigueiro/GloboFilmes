package classes;

public class Diretor extends Funcionario{
    public Diretor(String nome){
        super(nome);
    }

    @Override
    public void adicionarFilmeFeito(String nome) {
        super.adicionarFilmeFeito(nome, "Diretor");
    }
}

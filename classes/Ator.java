package classes;

public class Ator extends Funcionario{
    public Ator(String nome){
        super(nome);
    }

    @Override
    public void adicionarFilmeFeito(String nome) {
        super.adicionarFilmeFeito(nome, "Ator");
    }
}

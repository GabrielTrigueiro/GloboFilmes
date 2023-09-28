package classes;

public class Roteirista extends Funcionario{
    public Roteirista(String nome){
        super(nome);
    }

    @Override
    public void adicionarFilmeFeito(String nome) {
        super.adicionarFilmeFeito(nome, "Roteirista");
    }
}

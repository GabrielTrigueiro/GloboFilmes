package classes;

public class TrilhaSonora extends Funcionario{
    public TrilhaSonora(String nome){
        super(nome);
    }

    @Override
    public void adicionarFilmeFeito(String nome) {
        super.adicionarFilmeFeito(nome, "TrilhaSonora");
    }
}

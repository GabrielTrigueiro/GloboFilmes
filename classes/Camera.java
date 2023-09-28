package classes;

public class Camera extends Funcionario{
    public Camera(String nome){
        super(nome);
    }

    @Override
    public void adicionarFilmeFeito(String nome) {
        super.adicionarFilmeFeito(nome, "Camera");
    }
}


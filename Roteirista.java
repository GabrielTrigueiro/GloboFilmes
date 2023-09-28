import java.util.ArrayList;
import java.util.List;

class Roteirista implements Funcionario {
    private String nome;
    private List<String> funcoes;

    public Roteirista(String nome) {
        this.nome = nome;
        this.funcoes = new ArrayList<>();
    }

    public void adicionarFuncao(String funcao) {
        funcoes.add(funcao);
    }

    public void removerFuncao(String funcao) {
        funcoes.remove(funcao);
    }

    public String getNome() {
        return nome;
    }

    public List<String> getFuncoes() {
        return funcoes;
    }
}

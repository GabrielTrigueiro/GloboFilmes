
import java.util.List;

// Interface para Funcionario
interface Funcionario {
    void adicionarFuncao(String funcao);
    void removerFuncao(String funcao);
    String getNome();
    List<String> getFuncoes();
}
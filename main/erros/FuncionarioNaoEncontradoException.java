package main.erros;

public class FuncionarioNaoEncontradoException extends Exception {
    public FuncionarioNaoEncontradoException(String nome) {
        super("Funcionário não encontrado na filmografia: " + nome);
    }
}

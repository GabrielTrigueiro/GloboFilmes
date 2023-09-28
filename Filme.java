import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String diretor;
    private String roteirista;
    private int ano;
    private List<Funcionario> elenco;
    private String trilhaSonora;
    private double avaliacao;

    // Construtor
    public Filme(String nome, String diretor, String roteirista, int ano, String trilhaSonora) {
        this.nome = nome;
        this.diretor = diretor;
        this.roteirista = roteirista;
        this.ano = ano;
        this.trilhaSonora = trilhaSonora;
        this.elenco = new ArrayList<>();
        
    }

    // Métodos para adicionar/remover membros do elenco (sem alterações)
    public void adicionarElenco(Funcionario funcionario) {
        elenco.add(funcionario);
    }

    public void removerElenco(Funcionario funcionario) {
        elenco.remove(funcionario);
    }
    
    public void avaliarFilme(double avaliacao) {
        if (avaliacao >= 0 && avaliacao <= 5) {
            this.avaliacao = avaliacao;
        } else {
            System.out.println("Avaliação inválida. A avaliação deve estar entre 0 e 5 estrelas.");
        }
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    // Getters e setters para todas as propriedades
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getRoteirista() {
        return roteirista;
    }

    public void setRoteirista(String roteirista) {
        this.roteirista = roteirista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Funcionario> getElenco() {
        return elenco;
    }

    public void setElenco(List<Funcionario> elenco) {
        this.elenco = elenco;
    }

    public String getTrilhaSonora() {
        return trilhaSonora;
    }

    public void setTrilhaSonora(String trilhaSonora) {
        this.trilhaSonora = trilhaSonora;
    }
}
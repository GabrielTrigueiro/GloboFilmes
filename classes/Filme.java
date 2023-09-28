package classes;

import java.util.List;

public class Filme {
    private String nome;
    private int ano;

    private List<Ator> atores;

    private Diretor diretor;

    private Roteirista roteirista;

    private TrilhaSonora trilhaSonora;

    private Camera camera;

    public Filme(String nome, int ano, List<Ator> atores, Diretor diretor, Roteirista roteirista, TrilhaSonora trilhaSonora, Camera camera) {
        this.nome = nome;
        this.ano = ano;
        this.atores = atores;
        this.diretor = diretor;
        this.roteirista = roteirista;
        this.trilhaSonora = trilhaSonora;
        this.camera = camera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Roteirista getRoteirista() {
        return roteirista;
    }

    public void setRoteirista(Roteirista roteirista) {
        this.roteirista = roteirista;
    }

    public TrilhaSonora getTrilhaSonora() {
        return trilhaSonora;
    }

    public void setTrilhaSonora(TrilhaSonora trilhaSonora) {
        this.trilhaSonora = trilhaSonora;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Ano: " + ano + "\n" +
                "Roteirista: " + roteirista.getNome() + "\n" +
                "Diretor: " + diretor.getNome() + "\n" +
                "Trilha Sonora: " + trilhaSonora.getNome() + "\n" +
                "Camera: " + camera.getNome() + "\n" +
                "Atores: " + atores.stream().toArray();
    }
}

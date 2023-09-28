package classes;

public class FilmeTrabalhado {
    private String nomeDoFilme;
    private String funcaoDesempenhada;

    public FilmeTrabalhado(String nomeDoFilme, String funcaoDesempenhada) {
        this.nomeDoFilme = nomeDoFilme;
        this.funcaoDesempenhada = funcaoDesempenhada;
    }

   public void participacao(){
       System.out.println("Nome: " + nomeDoFilme + " Função: " + funcaoDesempenhada);
   }
}
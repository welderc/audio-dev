package audio;

public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes = 1;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public void setClassificacao(int classificacao) {
        if (classificacao >= 0 && classificacao <= 5) {
            this.classificacao = totalCurtidas;
        } else {
            System.out.println("Nota inválida, insira uma nota válida entre 0 e 5!!");
        }
    }


    public void reproduz () {
        int maximoDeReproducoes = 1;

        if(totalDeReproducoes > maximoDeReproducoes) {
            maximoDeReproducoes = totalDeReproducoes;
        }
        totalDeReproducoes++;

        System.out.println("Reproduzindo "+ titulo +" "+maximoDeReproducoes +" vezes");
    }
}

import java.util.ArrayList;

public class Exercicio {
    private String nome;
    private ArrayList<Serie> series = new ArrayList<Serie>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Serie> getListaSerie() {
        return series;
    }

    public void addSerie(Serie serie) {
        series.add(serie);
    }

    public void removeSerie(Serie serie) {
        series.remove(serie);
    }
}

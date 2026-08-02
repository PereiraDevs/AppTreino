import java.util.ArrayList;

public class Usuario {
    private String nome;
    private double altura;
    private double peso;
    private ArrayList<Treino> treinos = new ArrayList<Treino>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<Treino> getTreinos() {
        return treinos;
    }

    public void addTreino(Treino treino) {
        treinos.add(treino);
    }

    public void removeTreino(Treino treino) {
        treinos.remove(treino);
    }
}

import java.util.ArrayList;

public class Treino {
    private String nome;
    private ArrayList <Exercicio> exercicios = new ArrayList<Exercicio>();

    public String getNome() {
        return nome;
    }

    //depois preciso fazer verificação de nome valido
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void addExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public void removeExercicio(Exercicio exercicio) {
        exercicios.remove(exercicio);
    }

}

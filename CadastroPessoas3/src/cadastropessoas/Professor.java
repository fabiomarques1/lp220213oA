
package cadastropessoas;

public class Professor extends Pessoa {
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplina + '}';
    }
    
}

package cadastropessoas;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.trim().equals("")) {
            System.out.println("Preencha o nome!");
            return true;
        } else {
            this.nome = nome;
            return false;
        }
    }

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if (idade >=0 && idade <= 120) {
            this.idade = idade;
            return false;
        } else {
            System.out.println("Idade fora do padrão!");
            return true;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " Idade: " + idade;
    }
    
    
}

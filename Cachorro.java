package ex1;

public class Cachorro {


    public String nome;
    public int idade;
    public String sexo;
    public String raca;

    public Cachorro(String nome, int idade, String sexo, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", raca='" + raca + '\'' +
                '}';
    }
}



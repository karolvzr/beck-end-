public class Cavaleiro extends Personagem {

    public Cavaleiro(String nome) {
        super(nome, 130, 18, 12);
    }

    public void escudoPesado(Personagem inimigo) {
        System.out.println(getNome() + " usou golpe de escudo!");
        inimigo.receberDano(getAtaque() + 5);
    }
}
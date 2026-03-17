public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 100, 25, 5);
    }

    public void lancarMagia(Personagem inimigo) {
        System.out.println(getNome() + " lançou uma magia poderosa!");
        inimigo.receberDano(getAtaque() + 10);
    }
}
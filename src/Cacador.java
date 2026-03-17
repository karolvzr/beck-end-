public class Cacador extends Personagem {

    public Cacador(String nome) {
        super(nome, 90, 22, 8);
    }

    public void tiroPreciso(Personagem inimigo) {
        System.out.println(getNome() + " realizou um tiro preciso!");
        inimigo.receberDano(getAtaque() + 7);
    }
}

public class Personagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " atacou " + inimigo.getNome());
        inimigo.receberDano(ataque);
    }
    public void receberDano(int dano) {
        int danoFinal = dano - defesa;
        if (danoFinal <0) danoFinal = 0;

    vida -= danoFinal;


        System.out.println(nome + " recebeu " + danoFinal + " de dano");
        System.out.println("Vida atual: " + vida);
    }

public  void mostrarStatus() {
        System.out.println("\nNome: " + nome);
    System.out.println("Vida: " + vida);
    System.out.println("Ataque: " + ataque);
    System.out.println("Defesa: " + defesa);
    }

    public String getNome() {
        return nome;
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }


    public int getDefesa() {
        return defesa;
    }

}











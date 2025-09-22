
///O jogo precisa criar personagens com nome e pontos de vida (inicialmente 100). O personagem pode sofrer dano ou se curar.///

class Personagem {
    String nome;
    int vida;

    Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    void sofrerDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " sofreu " + dano + " de dano!");
    }

    void curar(int valor) {
        vida += valor;
        if (vida > 100) vida = 100;
        System.out.println(nome + " recuperou " + valor + " de vida!");
    }

    void exibirStatus() {
        System.out.println(nome + " - Vida: " + vida);
    }
}

public class Jogo {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Guerreiro");
        Personagem p2 = new Personagem("Mago");

        p1.sofrerDano(30);
        p1.exibirStatus();
        p1.curar(20);
        p1.exibirStatus();

        p2.sofrerDano(50);
        p2.curar(40);
        p2.exibirStatus();
    }
}

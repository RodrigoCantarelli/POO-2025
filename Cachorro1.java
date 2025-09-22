
///O sistema precisa cadastrar cães para banho e tosa. Cada cachorro tem um nome, raça e idade. Deve ser possível registrar o cachorro e exibir suas informações.///

class Cachorro {
    String nome;
    String raca;
    int idade;

    Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    void exibirInfo() {
        System.out.println("Nome: " + nome + ", Raça: " + raca + ", Idade: " + idade + " anos");
    }
}


public class Cachorro1 {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Rex", "Labrador", 3);
        Cachorro c2 = new Cachorro("Bella", "Poodle", 5);

        c1.exibirInfo();
        c2.exibirInfo();
    }

}

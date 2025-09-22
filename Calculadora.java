
///O sistema precisa calcular o valor total de produtos comprados. Cada produto tem nome, preço unitário e quantidade.///

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularTotal() {
        return preco * quantidade;
    }

    void exibirInfo() {
        System.out.println(nome + " - " + quantidade + " unidades, Total: R$ " + calcularTotal());
    }
}

public class Calculadora {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 25.50, 2);
        Produto p2 = new Produto("Feijão", 8.00, 5);

        p1.exibirInfo();
        p2.exibirInfo();
    }
}



///O sistema precisa registrar alunos, calcular sua média e verificar se estão aprovados ou reprovados.///

class Aluno {
    String nome;
    double nota1, nota2;

    Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();
        String status = (media >= 7) ? "Aprovado" : "Reprovado";
        System.out.println(nome + " - Média: " + media + " - " + status);
    }
}

public class Media {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 8.5, 7.0);
        Aluno a2 = new Aluno("Maria", 5.5, 6.0);

        a1.exibirResultado();
        a2.exibirResultado();
    }
}

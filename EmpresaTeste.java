
///O sistema registra funcionários. O Gerente tem setor e o Vendedor tem comissão além do salário base.///

class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Salário Base: R$ " + salarioBase);
    }
}

class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salarioBase, String setor) {
        super(nome, salarioBase);
        this.setor = setor;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Gerente: " + nome + " | Setor: " + setor + " | Salário: R$ " + salarioBase);
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Vendedor: " + nome + " | Comissão: R$ " + comissao + " | Salário Total: R$ " + (salarioBase + comissao));
    }
}

public class EmpresaTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Carlos", 5000, "Financeiro");
        Vendedor v = new Vendedor("Maria", 2000, 800);

        g.exibirInfo();
        v.exibirInfo();
    }
}

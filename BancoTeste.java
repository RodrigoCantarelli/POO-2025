
/// O sistema controla contas bancárias. A Conta Corrente cobra taxa nos saques e a Conta Poupança pode render juros.///

class Conta {
    protected int numero;
    protected double saldo;

    public Conta(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirDados() {
        System.out.println("Conta nº " + numero + " | Saldo: R$ " + saldo);
    }
}

class ContaCorrente extends Conta {
    private double taxaSaque;

    public ContaCorrente(int numero, double saldoInicial, double taxaSaque) {
        super(numero, saldoInicial);
        this.taxaSaque = taxaSaque;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaSaque;
        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$ " + valor + " realizado com taxa de R$ " + taxaSaque + ". Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }
}

class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int numero, double saldoInicial, double taxaJuros) {
        super(numero, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void renderJuros() {
        double rendimento = saldo * taxaJuros;
        saldo += rendimento;
        System.out.println("Juros de R$ " + rendimento + " aplicados. Saldo atual: R$ " + saldo);
    }
}

public class BancoTeste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(101, 1000, 5);
        ContaPoupanca cp = new ContaPoupanca(202, 2000, 0.02);

        cc.exibirDados();
        cc.depositar(500);
        cc.sacar(200);

        cp.exibirDados();
        cp.sacar(300);
        cp.renderJuros();
    }
}

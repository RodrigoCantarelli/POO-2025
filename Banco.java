
////O sistema precisa controlar contas bancárias com número e saldo. Deve permitir depositar, sacar e mostrar saldo atualizado////

class Conta {
    int numero;
    double saldo;

    Conta(int numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado.");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void exibirSaldo() {
        System.out.println("Conta " + numero + " - Saldo: R$ " + saldo);
    }
}

public class Banco {
    public static void main(String[] args) {
        Conta conta1 = new Conta(101, 500);
        Conta conta2 = new Conta(102, 1000);

        conta1.depositar(200);
        conta1.sacar(100);
        conta1.exibirSaldo();

        conta2.sacar(1200);
        conta2.depositar(500);
        conta2.exibirSaldo();
    }
}

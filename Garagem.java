///Registrar carros que chegam na garagem. Cada carro tem marca, modelo e ano. O sistema deve exibir os dados do carro.///

class Carro {
    String marca;
    String modelo;
    int ano;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}

public class Garagem {
    public static void main(String[] args) {
        Carro car1 = new Carro("Toyota", "Corolla", 2020);
        Carro car2 = new Carro("Honda", "Civic", 2022);

        car1.exibirInfo();
        car2.exibirInfo();
    }
}

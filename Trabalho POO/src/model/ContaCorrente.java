package model;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, Cliente titular) {
        super(numero, titular);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 1.50; // taxa fixa
        if (valor + taxa <= getSaldo()) {
            setSaldo(getSaldo() - (valor + taxa));
            System.out.println("Saque de R$" + valor + " realizado com taxa de R$1,50");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}

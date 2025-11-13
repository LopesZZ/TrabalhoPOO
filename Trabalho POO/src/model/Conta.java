package model;

public abstract class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta(String numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Encapsulamento
    public String getNumero() { return numero; }
    public double getSaldo() { return saldo; }
    public Cliente getTitular() { return titular; }

    // Métodos comuns
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        }
    }

    // Método abstrato → Abstração e Polimorfismo
    public abstract void sacar(double valor);

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta " + numero + " | Titular: " + titular.getNome() + " | Saldo: R$" + saldo;
    }
}

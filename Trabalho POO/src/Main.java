import model.*;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ana Clara", "111.222.333-44");
        Cliente c2 = new Cliente("Carlos Matheus", "555.666.777-88");

        Conta cc = new ContaCorrente("001", c1);
        Conta cp = new ContaPoupanca("002", c2);

        cc.depositar(500);
        cp.depositar(1000);

        cc.sacar(200);
        cp.sacar(300);

        System.out.println("\n--- Resumo das Contas ---");
        System.out.println(cc);
        System.out.println(cp);
    }
}

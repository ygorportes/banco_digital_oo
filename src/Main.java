public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente 1");

        ContaCorrente cc = new ContaCorrente(cliente);
        cc.depositar(100);

        ContaPoupanca poupanca = new ContaPoupanca(cliente);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println();
    }
}

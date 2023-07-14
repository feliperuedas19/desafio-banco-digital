
public class Main {
	public static void main(String[] args) {
		Cliente felipe = new Cliente();
		felipe.setNome("Felipe");
		
		Conta cc = new ContaCorrente(felipe);
		cc.depositar(75);
		
		Conta poupanca = new ContaPoupanca(felipe);
		cc.transferir(50, poupanca);
		
		cc.somarContas(cc.saldo, poupanca.saldo);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc.imprimirTotalContas();
	}
}

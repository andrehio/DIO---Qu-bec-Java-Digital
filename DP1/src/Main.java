
public class Main {
	public static void main(String[] args) {
		Banco mesaverde = new Banco("Mesa Verde");
		
		Cliente jose = new Cliente("José Almeida", mesaverde);
		Cliente maria = new Cliente("Maria Maciel", mesaverde);
		
		Conta joseCC = new ContaCorrente(jose);
		Conta joseCP = new ContaPoupanca(jose);
		
		Conta mariaCC = new ContaCorrente(maria);
		
		joseCC.depositar(100);
		joseCC.transferir(50, mariaCC);
		mariaCC.sacar(20);
		
		joseCC.imprimirExtrato();
		System.out.println("");
		mariaCC.imprimirExtrato();
		
		System.out.println("");
		mesaverde.imprimirListaClientes();
	}
}

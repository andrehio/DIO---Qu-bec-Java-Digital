import java.util.ArrayList;

public class Banco {
	private String nome;
	ArrayList<String> clientes = new ArrayList<>();
	
	public Banco(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addCliente(String nome) {
		this.clientes.add(nome);
	}
	
	public void imprimirListaClientes() {
		System.out.println("=== Lista de clientes ===");
		var i = 1;
		for (String cliente : clientes) {
			System.out.println(i + ". " + cliente);
			i++;
		}
	}
	
}

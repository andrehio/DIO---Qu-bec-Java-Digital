
public class Cliente {
	private String nome;
	private Banco banco;

	public Cliente(String nome, Banco banco) {
		this.nome = nome;
		this.banco = banco;
		this.banco.addCliente(this.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanco() {
		return banco.getNome();
	}
}

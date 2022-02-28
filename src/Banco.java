import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<ContaInterface> contas;
	private List<Cliente> clientes;
	
	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList<>();
		clientes = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ContaInterface> getContas() {
		return contas;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void removeConta(Conta conta) {
		this.contas.remove(conta);
	}

	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void removeCliente(Cliente cliente) {
		this.clientes.remove(cliente);
	}
	
	
	
}

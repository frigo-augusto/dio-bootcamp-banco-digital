
public class Conta implements ContaInterface{
	
	protected static int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	protected Cliente cliente;
	protected Banco banco;
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta(Cliente cliente, Banco banco) {
		this.cliente = cliente;
		this.banco = banco;
		banco.addConta(this);
		cliente.addConta(this);
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, ContaInterface contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Sua conta numero " 
			+ this.getNumero() 
			+ " na agencia "
			+ this.getAgencia()
			+ " tem um saldo de "
			+ this.getSaldo());
	}
	
	
}

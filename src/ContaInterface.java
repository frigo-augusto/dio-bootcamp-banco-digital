
public interface ContaInterface {

	public void sacar(double valor);
	
	public void depositar(double valor);
	
	public void transferir(double valor, ContaInterface contaDestino);
	
	public void imprimirExtrato();
}

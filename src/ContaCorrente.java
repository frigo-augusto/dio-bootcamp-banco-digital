
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	public void transferenciaEmergencial(float valor, ContaInterface contaDest) {
		super.saldo -= valor;
		contaDest.depositar(valor);
		super.saldo -= 20d; //20 reais de custo 
	}
	
}

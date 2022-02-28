
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}

	private static double SELIC = 10.31;
	private static double PERCENTAGE_SELIC = 0.7;
	
	public void aplicarRendimentoMensal() {
		super.saldo += saldo*SELIC*PERCENTAGE_SELIC*1/12;
	}
	
}

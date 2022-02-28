
public class Main {

	public static void main(String[] args) {
		
		Banco bancoIncrivel = new Banco("banco incrivel");
		
		Cliente jaderson = 
				new Cliente("jaderson", 781, 2800.70, bancoIncrivel);
		
		Conta contaPoupancaDoJaderson = new ContaPoupanca(jaderson, bancoIncrivel);
		Conta contaCorrenteDoJaderson = new ContaCorrente(jaderson, bancoIncrivel);
		
		
		
		System.out.println("programa encerrado");
		
	}

}

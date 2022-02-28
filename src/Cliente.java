import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private static final int MULT_SERASA = 4;
	
	private String nome;
	private List<ContaInterface> contas;
	private int serasaScore;
	private double rendaMensal;
	private Banco banco;
	
	public Cliente(String nome, int serasaScore, double renda, Banco banco) {
		super();
		this.nome = nome;
		this.serasaScore = serasaScore;
		this.rendaMensal = renda;
		this.banco = banco;
		banco.getClientes().add(this);
		contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSerasaScore() {
		return serasaScore;
	}

	public void setSerasaScore(int serasaScore) {
		this.serasaScore = serasaScore;
	}

	public double getRenda() {
		return rendaMensal;
	}

	public void setRenda(double renda) {
		this.rendaMensal = renda;
	}

	public static int getMultSerasa() {
		return MULT_SERASA;
	}

	public List<ContaInterface> getContas() {
		return contas;
	}
	
	public void addConta(ContaInterface conta) {
		contas.add(conta);
	}
	
	public void deleteConta(ContaInterface conta) {
		contas.remove(conta);
	}


	
	private boolean isEmprestimoDisponivel() {
		if (serasaScore > 300) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	public double valorEmprestimoDisponivel() {
		if (!this.isEmprestimoDisponivel() == false) {
			return rendaMensal*MULT_SERASA*serasaScore / 1000; //calculo ficticio de valor de emprestimo
		}
		else {
			return 0d;
		}
	}
	
	
}

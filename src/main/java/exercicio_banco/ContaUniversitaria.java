package exercicio_banco;

public class ContaUniversitaria extends Conta{
	
	public ContaUniversitaria(int nr, int agencia, String correntista, double saldo) {
		super(nr, agencia, correntista, saldo);
	}
	
	@Override
	public boolean deposito(double vl) {
		if(getSaldo() + vl <= 2000) {
			return super.deposito(vl);
		}
		return false;
	}

}

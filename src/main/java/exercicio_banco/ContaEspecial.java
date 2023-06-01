package exercicio_banco;

import lombok.Getter;

@Getter
public class ContaEspecial extends Conta{
	
	private double limite;
	
	public ContaEspecial(int nr, int agencia, String correntista, double saldo, double limite) {
		super(nr, agencia, correntista, saldo);
		this.limite = limite;
	}
	
	@Override
	public boolean saque(double vl) {
		if(getSaldo() + getLimite() >= vl) {
			saldo = getSaldo() - vl;
			return true;
		}
		return false;
	}
}

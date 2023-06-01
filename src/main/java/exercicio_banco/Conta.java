package exercicio_banco;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Conta {

	private int nr;
	private int agencia;
	private String correntista;
	protected double saldo;

	public boolean deposito(double vl) {
		if (vl > 0) {
			saldo = getSaldo() + vl;
			return true;
		}
		return false;
	}

	public boolean saque(double vl) {
		if(getSaldo() >= vl) {
			saldo = getSaldo() - vl;
			return true;
		}
		return false;
	}

	public boolean transferencia(double vl, Conta destino) {
		if(saque(vl)) {
			if(destino.deposito(vl)) {
				return true;
			}else {
				deposito(vl);
				return false;
			}
		}
		return false;
	}

}

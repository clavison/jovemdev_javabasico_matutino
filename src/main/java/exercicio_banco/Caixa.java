package exercicio_banco;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Caixa {
	
	List<Conta> contas = new ArrayList<Conta>();
	
	public void addConta(Conta c) {
		contas.add(c);
	}
	
	public boolean deposito(double valor, Conta c) {
		return c.deposito(valor);
	}
	
	public boolean saque(double valor, Conta c) {
		return c.saque(valor);
	}
	
	public boolean transferencia(double valor, Conta origem, Conta destino) {
		return origem.transferencia(valor, destino);
	}
	
}

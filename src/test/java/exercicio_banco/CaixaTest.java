package exercicio_banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CaixaTest {
	
	private Caixa caixa = new Caixa();
	
	@BeforeEach
	public void init() {
		caixa.getContas().clear();
		caixa.addConta(new Conta(1, 1, "Corr 1", 10));
		caixa.addConta(new ContaEspecial(2, 2, "Corr 2", 10, 500));
		caixa.addConta(new ContaUniversitaria(3, 3, "Corr 3", 10));
	}
	
	@Test
	@DisplayName("Transferencia ente Cta Corr e Cta Univ possível")
	public void transf1() {
		Conta corr = caixa.getContas().get(0);
		ContaUniversitaria univ = (ContaUniversitaria)caixa.getContas().get(2);
		caixa.transferencia(10, corr, univ);
		assertEquals(0, corr.getSaldo());
		assertEquals(20, univ.getSaldo());
	}
	@Test
	@DisplayName("Transferencia ente Cta Corr e Cta Univ impossível")
	public void transf2() {
		Conta corr = caixa.getContas().get(0);
		ContaUniversitaria univ = (ContaUniversitaria)caixa.getContas().get(2);
		caixa.deposito(1990, univ);
		assertEquals(2000, univ.getSaldo());
		caixa.transferencia(10, corr, univ);
		assertEquals(10, corr.getSaldo());
		assertEquals(2000, univ.getSaldo());
	}

}

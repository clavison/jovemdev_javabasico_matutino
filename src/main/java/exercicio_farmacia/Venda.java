package exercicio_farmacia;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Venda {
	
	private Cliente cliente;
	private Produto produto;
	private int quantidade;
	private String medico;
	
	@Override
	public String toString() {
		return cliente.getNome() + "-" + produto.getNome()+"-"+(produto.getValor() + quantidade);
	}
	
	public boolean isCliente(Cliente c) {
		return c.getNome().equalsIgnoreCase(cliente.getNome());
	}

}

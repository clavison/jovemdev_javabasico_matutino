package exercicio_farmacia;

import lombok.Getter;

@Getter
public class Medicamento extends Produto {

	private boolean isReceita;

	public Medicamento(String nome, int estoque, double valor, boolean isReceita) {
		super(nome, estoque, valor);
		this.isReceita = isReceita;
	}

	@Override
	public boolean vender(Venda v) {
		if(isReceita && v.getMedico()==null) {
			return false;
		}else {
			if (getEstoque() >= v.getQuantidade()) {
				return super.vender(v);
			}
			return false;
		}
	}

}

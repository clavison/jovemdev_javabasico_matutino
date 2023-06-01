package exercicio_farmacia;

public class Perfumaria extends Produto {
	
	public Perfumaria(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
	
	@Override
	public boolean vender(Venda v) {
		if(getEstoque() >= v.getQuantidade() && v.getCliente().getSaldo() < 300) {
			return super.vender(v);
		}
		return false;
	}

}

package exercicio_farmacia;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Farmacia {
	
	private List<Venda> vendas = new ArrayList<Venda>();
	
	public void vender(Cliente cliente, Produto produto, int qt, String medico) {
		Venda v = new Venda(cliente, produto, qt, medico);
		if(produto.vender(v)) {
			vendas.add(v);
		}
	}
	
	public List<Venda> vendasPorCliente(Cliente c){
//		List<Venda> vendasEncontradas = new ArrayList<>();
//		for (Venda venda : vendas) {
//			if(venda.isCliente(c)) {
//				vendasEncontradas.add(venda);
//			}
//		}
//		return vendasEncontradas;
		
		return vendas.stream().filter( v -> v.isCliente(c)).toList();
	}
	
	

}

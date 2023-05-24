package segunda_aula.exercicio_carro;

import java.util.List;

import javax.swing.JOptionPane;

public class Util {
	
	static EnumCor escolheCor() {
		String menu = "Cores disponíveis\n\n";
		for(EnumCor cor: EnumCor.values()) {
			menu += cor.codigo + " - " + cor.descricao+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		return EnumCor.findById(op);
	}
	
	static String listaPorFabricacao(List<Carro> carros) {
		int anoInicial = Integer.parseInt(JOptionPane.showInputDialog("Ano Inicial"));
		int anoFinal = Integer.parseInt(JOptionPane.showInputDialog("Ano Final"));
		String ret = "Carros fabricados entre %s e %s\n"
				.formatted(anoInicial, anoFinal);
		int count = 0;
		for (Carro c : carros) {
			if(c.isPeriodoFabricacao(anoInicial, anoFinal)) {
				ret += c.toString();
				count++;
			}
		}
		ret += "Representa "+ percentualCarros(carros, count)+"% dos carros";
		return ret;
	}
	
	static String listaPorMarca(List<Carro> carros) {
		String marca = JOptionPane.showInputDialog("Marca");
		String ret = "Carros da marca %s\n"
				.formatted(marca);
		int count = 0;
		for (Carro c : carros) {
			if(c.isMarca(marca)) {
				ret += c.toString();
				count ++;
			}
		}
		ret += "Representa "+ percentualCarros(carros, count)+"% dos carros";
		return ret;
	}
	
	static String listaPorCor(List<Carro> carros) {
		EnumCor cor = escolheCor();
		String ret = "Carros da cor %s\n"
				.formatted(cor.descricao);
		int count = 0;
		for (Carro c : carros) {
			if(c.isCor(cor)) {
				ret += c.toString();
				count ++;
			}
		}
		ret += "Representa "+ percentualCarros(carros, count)+"% dos carros";
		return ret;
	}
	
	static double percentualCarros(List<Carro> carros, int qt) {
		return (double)qt / (double)(carros.size()) * 100;
	}
	
	static int escolheOP() {
		String menu = "1 – Cadastrar Carro\r\n"
				+ "2 – Listar os carros por período de fabricação\r\n"
				+ "3 – Listar carros por marca\r\n"
				+ "4 – Listar carros por cor\r\n"
				+ "5 – Sair \r\n";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}

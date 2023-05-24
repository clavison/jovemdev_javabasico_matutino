package segunda_aula.exercicio_carro;

import javax.swing.JOptionPane;

public class Carro {

	String marca;
	int ano;
	EnumCor cor;

	void cadastrar() {
		marca = JOptionPane.showInputDialog("Marca");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		cor = Util.escolheCor();
		if (!validar()) {
			cadastrar();
		}
	}

	boolean validar() {
		if (marca.trim().equals("")) {
			JOptionPane.showMessageDialog(null, "A marca deve ser preenchida");
			return false;
		}
		if (ano < 0 || ano > 2023) {
			JOptionPane.showMessageDialog(null, "Ano inválido");
			return false;
		}
		if (cor == null) {
			JOptionPane.showMessageDialog(null, "Cor inválida");
			return false;
		}
		return true;
	}

	boolean isPeriodoFabricacao(int anoInicial, int anoFinal) {
		return ano >= anoInicial && ano <= anoFinal;
	}

	boolean isMarca(String marcaBusca) {
		return marcaBusca.equalsIgnoreCase(marca);
	}

	boolean isCor(EnumCor corBusca) {
		return corBusca == cor;
	}

	public String toString() {
		return "Marca: " + marca + "\n" 
				+ "Ano: " + ano + "\n" 
				+ "Cor: " + cor.descricao + "\n" 
				+ "__________\n";
	}

}

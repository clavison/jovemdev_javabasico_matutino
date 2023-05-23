package segunda_aula;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrincipalImc {
	
	static List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		String menu = "1 - Cadastrar\n"
				+ "2 - Avaliar\n\n"
				+ "3 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1) {
				Pessoa p = new Pessoa();
				p.cadastra();
				pessoas.add(p);
			}
			if(op == 2) {
				String resultado = "";
				for (Pessoa p : pessoas) {
					resultado += p.toString();
				}
				JOptionPane.showMessageDialog(null, resultado);
			}
		}while(op != 3);
	}

}

package segunda_aula.exercicio_carro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrincipalCarro {
	
	public static void main(String[] args) {
		List<Carro> lista = new ArrayList<Carro>();
		int op = 0;
		do {
			op = Util.escolheOP();
			switch (op) {
			case 1:
				Carro c = new Carro();
				c.cadastrar();
				lista.add(c);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, Util.listaPorFabricacao(lista));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, Util.listaPorMarca(lista));
				break;
			case 4:
				JOptionPane.showMessageDialog(null, Util.listaPorCor(lista));
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "By");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}while(op != 5);
	}

}

package exe_times;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrincipalTime {
	
	public static void main(String[] args) {
		List<Time> times = new ArrayList<Time>();
		int op = 0;
		do {
			op = Util.escolheMenu();
			switch (op) {
			case 1:
				Util.cadastraTime(times);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, Util.listaJogadoresTime(times));
				break;
			case 3:
				JOptionPane.showMessageDialog(null, Util.artilheiroCampeonato(times));
				break;
			case 4:
				JOptionPane.showMessageDialog(null, Util.timeMaisGols(times));
				break;
			}
		}while(op!=5);
	}

}

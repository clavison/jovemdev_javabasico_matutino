package exe_times;

import java.util.ArrayList;
import java.util.List;

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
				Util.listaJogadoresTime(times);
				break;
			case 3:
				Util.artilheiroCampeonato(times);
				break;
			case 4:
				Util.timeMaisGols(times);
				break;
			}
		}while(op!=5);
	}

}

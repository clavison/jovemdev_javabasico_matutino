package exe_times;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;

@Getter
public class Time {
	
	private String nome;
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	
	public void cadastra() {
		nome = JOptionPane.showInputDialog("Nome do time");
		String op = "";
		do {
			Jogador j = new Jogador();
			j.cadastra();
			jogadores.add(j);
			op = JOptionPane.showInputDialog("Deseja cadastrar mais jogadores? (S/N)");
		}while(op.equalsIgnoreCase("S"));
	}
	
	public Jogador getArtilheiro () {
		Jogador artilheiro = jogadores.get(0);
		for (Jogador jogador : jogadores) {
			if(jogador.getGols() > artilheiro.getGols()) {
				artilheiro = jogador;
			}
		}
		return artilheiro;
	}
	
	public String listaJogadores() {
		String ret = "Jogadores do time: " + nome+"\n";
		for (Jogador jogador : jogadores) {
			ret += jogador;
		}
		return ret;
	}
	
	public int getGols() {
		int gols = 0;
		for (Jogador jogador : jogadores) {
			gols += jogador.getGols();
		}
		return gols;
	}

}

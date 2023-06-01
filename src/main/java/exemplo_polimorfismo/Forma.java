package exemplo_polimorfismo;

import lombok.Getter;

@Getter
public class Forma {
	
	private String nome;
	
	public Forma(String nome) {
		this.nome = nome;
	}
	
	public String desenhar() {
		return "Sou a forma " + getNome();
	}

}

package segunda_aula.exercicio_carro;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumCor {
	
	BRANCO(1, "Branco"),
	PRETO(2, "Preto"),
	AZUL(3, "Azul"),
	VERMELHO(4, "Vermelho"),
	PRATA(5, "Prata");
	
	
	private int codigo;
	private String descricao;

	
	
	public static EnumCor findById(int codigo) {
		for (EnumCor cor : EnumCor.values()) {
			if(codigo == cor.codigo) {
				return cor;
			}
		}
		return null;
	}
	
	

}

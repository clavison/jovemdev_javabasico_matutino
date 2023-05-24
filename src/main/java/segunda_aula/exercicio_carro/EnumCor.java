package segunda_aula.exercicio_carro;

public enum EnumCor {
	
	BRANCO(1, "Branco"),
	PRETO(2, "Preto"),
	AZUL(3, "Azul"),
	VERMELHO(4, "Vermelho"),
	PRATA(5, "Prata");
	
	
	public int codigo;
	public String descricao;

	private EnumCor(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static EnumCor findById(int codigo) {
		for (EnumCor cor : EnumCor.values()) {
			if(codigo == cor.codigo) {
				return cor;
			}
		}
		return null;
	}
	
	

}

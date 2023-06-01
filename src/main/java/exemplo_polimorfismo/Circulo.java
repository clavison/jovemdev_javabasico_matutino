package exemplo_polimorfismo;

public class Circulo extends Forma{
	
	public Circulo() {
		super("Círculo");
	}
	
	@Override
	public String desenhar() {
		return "Sou um círculo e tenho meu próprio desenho";
	}
	
	public String calculaArea() {
		return "Minha área pode ser calculada";
	}

}

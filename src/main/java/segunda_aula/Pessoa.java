package segunda_aula;

import javax.swing.JOptionPane;

public class Pessoa {
	
	String nome;
	String sexo;
	double peso;
	double altura;
	
	double calculaImc(){
		return peso / (altura * altura);
	}
	
	void cadastra() {
		nome = JOptionPane.showInputDialog("Nome");
		sexo = JOptionPane.showInputDialog("Sexo");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
	}
	
	public String toString() {
		double imc = calculaImc();
		String avaliação = "";
		if( sexo.equalsIgnoreCase("M")) {
			if(imc > 100 ) {
				avaliação = "Acima do peso";
			}else {
				avaliação = "Peso Normal";
			}
		}else {
			if(imc > 60 ) {
				avaliação = "Acima do peso";
			}else {
				avaliação = "Peso Normal";
			}
		}
		
		return nome + " - " + imc + " - " + avaliação + "\n";
	}

}

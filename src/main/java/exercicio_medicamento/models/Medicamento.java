package exercicio_medicamento.models;

import java.util.ArrayList;
import java.util.List;

import exercicio_medicamento.enums.EnumAdmMedicamento;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Medicamento {
	
	@NonNull
	private String nome;
	@NonNull
	private EnumAdmMedicamento administracao;
	private List<String> contraIndicacoes = new ArrayList<String>();
	private List<String> indicacoes = new ArrayList<String>();
	
	public boolean isIndicado(String sintoma) {
		return indicacoes.contains(sintoma);
	}
	
	public boolean isContraIndicado(List<String> condicaoSaude) {
		return condicaoSaude.stream()
				.anyMatch(contraIndicacoes :: contains);
	}
	
	public void addIndicacao(String indicacao) {
		indicacoes.add(indicacao);
	}
	
	public void addContraIndicacao(String contraIndicacao) {
		contraIndicacoes.add(contraIndicacao);
	}

}

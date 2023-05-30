package exercicio_medicamento.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exercicio_medicamento.enums.EnumAdmMedicamento;
import exercicio_medicamento.models.Medicamento;
import exercicio_medicamento.models.Pessoa;

class ConsultorioTest {
	
	Consultorio consultorio = new Consultorio();
	
	@BeforeEach
	void init() {
	    consultorio.getMedicamentos().clear();
	    consultorio.getPessoas().clear();
		Pessoa p1 = new Pessoa("Pessoa 1", "Gripe");
		p1.addCondicaoSaude("Diabetes");
		p1.addCondicaoSaude("Pressão Alta");
		
		Pessoa p2 = new Pessoa("Pessoa 2", "Dor");
		p2.addCondicaoSaude("Pressão Alta");
		
		Pessoa p3 = new Pessoa("Pessoa 3", "Dengue");
		
		consultorio.getPessoas().add(p1);
		consultorio.getPessoas().add(p2);
		consultorio.getPessoas().add(p3);
		
		Medicamento m1 = new Medicamento("Medicamento 1", EnumAdmMedicamento.ORAL);
		m1.addIndicacao("Dor");
		m1.addIndicacao("Febre");
		m1.addContraIndicacao("Diabetes");
		
		Medicamento m2 = new Medicamento("Medicamento 2", EnumAdmMedicamento.ORAL);
		m2.addIndicacao("Gripe");
		
		consultorio.getMedicamentos().add(m1);
		consultorio.getMedicamentos().add(m2);
		
	}

	@Test
	@DisplayName("Teste cadastrar Medicamento")
	void addMedicamento() {
		Medicamento m = new Medicamento("Teste 1", EnumAdmMedicamento.ORAL);
		consultorio.cadastraMedicamento(m);
		assertEquals(3, consultorio.getMedicamentos().size());
	}
	
	@Test
	@DisplayName("Teste cadastrar Pessoa")
	void addPessoa() {
		Pessoa p = new Pessoa("Teste", "");
		consultorio.cadastraPessoa(p);
		assertEquals(4, consultorio.getPessoas().size());
	}
	
	@Test
	@DisplayName("Teste prescricao ok")
	void addPrescricaoOK() {
		Pessoa p = consultorio.getPessoas().get(1);
		Medicamento m = consultorio.getMedicamentos().get(0);
		consultorio.prescreveMedicamento(p, m);
		assertEquals(1, p.getMedicamentos().size());
		assertEquals("Medicamento 1", p.getMedicamentos().get(0).getNome());
	}
	
	@Test
	@DisplayName("Teste prescricao por falha na indicação")
	void addPrescricaoFalhaIndicacao() {
		Pessoa p = consultorio.getPessoas().get(0);
		Medicamento m = consultorio.getMedicamentos().get(0);
		consultorio.prescreveMedicamento(p, m);
		assertEquals(0, p.getMedicamentos().size());
	}
	
	

}

package facade; // Este é o pacote onde a classe Facade está localizada.

import subsistema1.crm.CrmService; // Importa a classe CrmService do subsistema1.
import subsistema2.cep.CepApi; // Importa a classe CepApi do subsistema2.

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		// Método que simplifica a interação com subsistemas diferentes e oculta detalhes complexos.
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		// Usa a classe CepApi para recuperar a cidade com base no CEP fornecido.

		String estado = CepApi.getInstancia().recuperarEstado(cep);
		// Usa a classe CepApi para recuperar o estado com base no CEP fornecido.

		CrmService.gravarCliente(nome, cep, cidade, estado);
		// Usa a classe CrmService para gravar as informações do cliente no sistema de CRM,
		// incluindo nome, CEP, cidade e estado, simplificando a interação com o subsistema de CRM.
	}
}

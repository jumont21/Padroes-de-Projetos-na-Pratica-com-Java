package subsistema1.crm; // Este é o pacote onde a classe CrmService está localizada.

public class CrmService {
	
	private CrmService() {
		super();
		// Construtor privado para evitar que a classe seja instanciada externamente.
		// Isso torna a classe um candidato para implementar o padrão Singleton,
		// onde a única instância é controlada internamente.
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		// Método público estático para gravar informações do cliente no sistema de CRM.
		System.out.println("Cliente salvo no sistema de CRM:"); // Imprime uma mensagem no console.
		System.out.println(nome); // Imprime o nome do cliente no console.
		System.out.println(cep); // Imprime o CEP do cliente no console.
		System.out.println(cidade); // Imprime a cidade do cliente no console.
		System.out.println(estado); // Imprime o estado do cliente no console.
	}
}

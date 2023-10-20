package subsistema2.cep; // Este é o pacote onde a classe CepApi está localizada.

public class CepApi {
	private static CepApi instancia = new CepApi(); // Cria uma instância única da classe CepApi.

	private CepApi() {
		super();
		// Construtor privado para evitar que a classe seja instanciada externamente.
		// Isso implementa o padrão Singleton, garantindo que apenas uma instância da classe seja criada.
	}

	public static CepApi getInstancia() {
		// Método estático que retorna a instância única criada no início.
		return instancia;
	}

	public String recuperarCidade(String cep) {
		// Método para recuperar a cidade com base em um CEP fornecido.
		// Neste exemplo, ele retorna uma cidade fixa (Araraquara) para fins de demonstração.
		return "Araraquara";
	}

	public String recuperarEstado(String cep) {
		// Método para recuperar o estado com base em um CEP fornecido.
		// Neste exemplo, ele retorna um estado fixo (SP) para fins de demonstração.
		return "SP";
	}
}
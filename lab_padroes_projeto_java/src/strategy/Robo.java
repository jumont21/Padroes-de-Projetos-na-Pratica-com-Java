package strategy; // Este é o pacote onde a classe Robo está localizada.

public class Robo {
	
	private Comportamento comportamento; // Um atributo que armazena o comportamento atual do robô.

	// Método para definir o comportamento do robô com base na estratégia fornecida.
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento; // Define o comportamento do robô com a estratégia fornecida.
	}
	
	// Método para executar a ação de mover com base na estratégia definida.
	public void mover() {
		comportamento.mover(); // Executa a ação de mover de acordo com o comportamento definido.
	}
}

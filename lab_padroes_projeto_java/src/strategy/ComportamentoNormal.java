package strategy; // Este é o pacote onde a classe ComportamentoNormal está localizada.

/*
 * a classe ComportamentoNormal está seguindo um contrato. Esse contrato é definido pela 
 * interface Comportamento, e quando uma classe implementa uma interface, ela concorda em 
 * fornecer uma implementação para todos os métodos especificados na interface.
 */

public class ComportamentoNormal implements Comportamento {
	// Classe ComportamentoNormal implementa a interface Comportamento, o que significa
	// que deve fornecer uma implementação para todos os métodos definidos na interface.

	@Override
	public void mover() {
		// Este é o método "mover" definido pela interface Comportamento.
		// Quando este método é chamado, a seguinte linha será executada:

		System.out.println("Movendo-se normalmente...");
		// Imprime uma mensagem indicando que o robô está se movendo normalmente no console.
	}
}
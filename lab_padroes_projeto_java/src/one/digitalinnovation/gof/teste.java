package one.digitalinnovation.gof;
import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Robo;
import strategy.ComportamentoNormal;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoAgressivo;
import strategy.Comportamento;


public class teste {

	public static void main(String[] args) {
		
		// SINGLETON
		
		// Instanciar para ver se o Singleton está funcionando
		SingletonLazy lazy = SingletonLazy.getInstancia(); // Cria uma instância do Singleton Lazy
		System.out.println(lazy); // Imprime a instância do Singleton Lazy
		lazy = SingletonLazy.getInstancia(); // Obtém a mesma instância já criada
		System.out.println(lazy); // Imprime a mesma instância do Singleton Lazy
		
		SingletonEager eager = SingletonEager.getInstancia(); // Cria uma instância do Singleton Eager
		System.out.println(eager); // Imprime a instância do Singleton Eager
		eager = SingletonEager.getInstancia(); // Obtém a mesma instância já criada
		System.out.println(eager); // Imprime a mesma instância do Singleton Eager
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia(); // Cria uma instância do Singleton Lazy Holder
		System.out.println(lazyHolder); // Imprime a instância do Singleton Lazy Holder
		lazyHolder = SingletonLazyHolder.getInstancia(); // Obtém a mesma instância já criada
		System.out.println(lazyHolder); // Imprime a mesma instância do Singleton Lazy Holder
		
		// STRATEGY
		
		Comportamento defensivo = new ComportamentoDefensivo(); // Cria uma estratégia defensiva
		Comportamento normal = new ComportamentoNormal(); // Cria uma estratégia normal
		Comportamento agressivo = new ComportamentoAgressivo(); // Cria uma estratégia agressiva
		
		Robo robo = new Robo(); // Cria um robô
		
		robo.setComportamento(normal); // Define a estratégia normal para o robô
		robo.mover(); // O robô se move de acordo com a estratégia normal
		robo.mover(); // O robô se move novamente de acordo com a estratégia normal
		
		robo.setComportamento(defensivo); // Define a estratégia defensiva para o robô
		robo.mover(); // O robô se move de acordo com a estratégia defensiva
		
		robo.setComportamento(agressivo); // Define a estratégia agressiva para o robô
		robo.mover(); // O robô se move de acordo com a estratégia agressiva
		robo.mover(); // O robô se move novamente de acordo com a estratégia agressiva
		robo.mover(); // O robô se move mais uma vez de acordo com a estratégia agressiva
		
		
		// FACADE
		
		Facade facade = new Facade();
		// Cria uma instância da classe Facade, que é a fachada para interagir com subsistemas.

		facade.migrarCliente("Juliana", "12345678");
		// Chama o método "migrarCliente" na instância da classe Facade, passando o nome "Juliana" e o CEP "12345678".
		// Este método, por sua vez, cuida da interação com subsistemas, como a classe CepApi para recuperar informações de CEP
		// e a classe CrmService para gravar informações do cliente no sistema de CRM.
	
	}

}
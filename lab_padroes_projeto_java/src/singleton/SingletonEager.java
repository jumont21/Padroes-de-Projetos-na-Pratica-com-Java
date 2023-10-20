package singleton;

/*
 * Singleton "apressado"
 */

/*Singleton apressado porque ao invés de fazer a verificação, ele logo no momento em que a variavel estática
* é definida ele já atribui a instancia. Assim que a classe for acionada por alguém essa instancia já é atribuida 
* e automaticamente quando alguém chamar ela já vai estar pronta para ser retornada.
*/

public class SingletonEager {
    // A instância única do Singleton é criada e inicializada imediatamente nesta linha
    private static SingletonEager instancia = new SingletonEager();

    // Construtor privado para impedir a criação de instâncias fora da classe
    private SingletonEager() {
        super();
    }

    // Método público para obter a instância única do Singleton
    public static SingletonEager getInstancia() {
        // Retorna a instância única que foi criada e inicializada previamente
        return instancia;
    }
}
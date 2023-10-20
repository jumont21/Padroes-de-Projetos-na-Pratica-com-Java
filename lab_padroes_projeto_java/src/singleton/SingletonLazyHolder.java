package singleton;

/**
 * Singleton "LazyHolder"
 * @author Juliana Monteiro
 */

// Holder porque ele vai encapsular essa instancia em uma classe estática interna que será chamada de "Holder"

// Singleton preguiçoso porque no primeiro momento não disponibiliza a instância para o usuário

public class SingletonLazyHolder {
    // Classe interna (InstanceHolder) que mantém a instância única do Singleton
    private static class InstanceHolder {
        // A instância única do Singleton é criada e inicializada imediatamente nesta linha
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    // Construtor privado para impedir a criação de instâncias fora da classe
    private SingletonLazyHolder() {
        super();
    }

    // Método público para obter a instância única do Singleton
    public static SingletonLazyHolder getInstancia() {
        // Retorna a instância única que foi criada e inicializada pela classe interna
        return InstanceHolder.instancia;
    }
}
package singleton;

/**
 * Singleton "preguiçoso"
 * @author Juliana Monteiro
 */

// Singleton preguiçoso porque no primeiro momento não disponibiliza a instância para o usuário

public class SingletonLazy {
    // A instância única do Singleton é armazenada nesta variável estática
    private static SingletonLazy instancia;

    // Construtor privado para impedir a criação de instâncias fora da classe
    private SingletonLazy() {
        super();
    }

    // Método público para obter a instância única do Singleton
    public static SingletonLazy getInstancia() {
        // Verifica se a instância ainda não foi criada
        if (instancia == null) {
            // Se ainda não existe uma instância, cria uma nova
            instancia = new SingletonLazy();
        }
        // Retorna a instância existente ou recém-criada
        return instancia;
    }
}
package strategy; // Este é o pacote onde a interface Comportamento está localizada.

public interface Comportamento {
    void mover();
    // Esta é uma interface chamada "Comportamento" que define um contrato.
    // A interface contém apenas um método, "mover()", que qualquer classe que a implementa deve fornecer.
    // Esse método representa o comportamento do robô quando ele se move.
}
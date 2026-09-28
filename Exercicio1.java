public class Exercicio1 {

    // Abordagem Recursiva Pura
    public static long fatorialRecursivo(int n) {
        // Condição de parada fundamental para evitar estouro de pilha
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("--- Exercício 1: Fatorial Recursivo ---");
        System.out.println("Fatorial(3) = " + fatorialRecursivo(3)); // Saída: 6
        System.out.println("Fatorial(7) = " + fatorialRecursivo(7)); // Saída: 5040
    }
}
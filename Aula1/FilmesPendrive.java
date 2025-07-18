public class FilmesPendrive {
    public static void main(String[] args) {
        System.out.println("\nPassos para colocar filmes antigos no pendrive e assistir na TV:\n");

        System.out.println("1. Encontrar o pendrive");
        System.out.println("2. Ligar o computador");
        System.out.println("3. Encontrar a pasta de filmes antigos");
        System.out.println("4. Conectar o pendrive");

        boolean espacoDisponivel = verificarEspacoPendrive(); // Simula a verificação
        if (!espacoDisponivel) {
            System.out.println("5. Liberar espaço no pendrive");
        }

        System.out.println("6. Copiar os filmes antigos para o pendrive");
        System.out.println("7. Desconectar pendrive do computador");
        System.out.println("8. Conectar pendrive na TV");
        System.out.println("9. Escolher o filme desejado");
        System.out.println("10. Play\n");
    }

    // Simulação simples para exemplo
    public static boolean verificarEspacoPendrive() {
        // Retorne false para testar a condição de liberar espaço
        return false;
    }
}
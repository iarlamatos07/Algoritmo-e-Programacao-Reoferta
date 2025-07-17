public class Algoritmo {
    public static void main(String[] args) {
        System.out.println("Colocar filmes antigos no pendrive para assistir na TV");

        System.out.println("1. Encontrar o pendrive");
        System.out.println("2. Ligar o computador");
        System.out.println("3. Encontrar a pasta de filmes antigos");
        System.out.println("4. Conectar o pendrive");

        boolean espacoDisponivel = verificarEspacoNoPendrive();

        System.out.println("5. Verificar se há espaço disponível no pendrive");
        if (!espacoDisponivel) {
            System.out.println("Liberar espaço no pendrive");
            liberarEspaco();
        }

        System.out.println("6. Copiar os filmes antigos para o pendrive");
        copiarFilmes();

        System.out.println("7. Desconectar pendrive do computador");
        System.out.println("8. Conectar pendrive na TV");
        System.out.println("9. Escolher o filme desejado");
        System.out.println("10. Play");
    }

    static boolean verificarEspacoNoPendrive() {
        // Simulação da verificação de espaço
        int espacoLivreMB = 1500; // Exemplo: espaço disponível em MB
        int tamanhoDosFilmesMB = 2000;

        return espacoLivreMB >= tamanhoDosFilmesMB;
    }

    static void liberarEspaco() {
        // Lógica para liberar espaço (simulada)
        System.out.println("Deletando arquivos antigos ou desnecessários...");
    }

    static void copiarFilmes() {
        // Lógica para copiar filmes (simulada)
        System.out.println("Filmes copiados com sucesso!");
    }
}
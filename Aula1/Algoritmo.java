import java.util.*;

public class FilmesAntigosPendrive {
    static Scanner scanner = new Scanner(System.in);
    static boolean pendriveEncontrado = false;
    static boolean computadorLigado = false;
    static boolean pastaFilmesEncontrada = false;
    static boolean pendriveConectado = false;
    static boolean espacoVerificado = false;
    static boolean filmesCopiados = false;
    static boolean pendriveDesconectado = false;
    static boolean pendriveNaTV = false;
    static boolean filmeEscolhido = false;

    static List<String> filmesAntigos = Arrays.asList("Casablanca", "Cidadão Kane", "Cantando na Chuva");
    static List<String> pendrive = new ArrayList<>();
    static final int ESPACO_TOTAL = 3;

    public static void main(String[] args) {
        System.out.println("🎬 Algoritmo: Colocar filmes antigos no pendrive para assistir na TV");

        passo1_encontrarPendrive();
        passo2_ligarComputador();
        passo3_encontrarPastaFilmes();
        passo4_conectarPendrive();
        passo5_verificarEspaco();
        passo6_copiarFilmes();
        passo7_desconectarPendrive();
        passo8_conectarNaTV();
        passo9_escolherFilme();
        passo10_darPlay();

        System.out.println("\n✅ Processo concluído! Bom filme! 🍿");
    }

    static void confirmar(String mensagem) {
        System.out.print(mensagem + " (s para sim): ");
        String resposta = scanner.nextLine().trim().toLowerCase();
        if (!resposta.equals("s")) {
            System.out.println("Operação cancelada. Encerrando...");
            System.exit(0);
        }
    }

    static void passo1_encontrarPendrive() {
        confirmar("Passo 1: Encontrar o pendrive");
        pendriveEncontrado = true;
        System.out.println("✔️ Pendrive encontrado.");
    }

    static void passo2_ligarComputador() {
        confirmar("Passo 2: Ligar o computador");
        computadorLigado = true;
        System.out.println("✔️ Computador ligado.");
    }

    static void passo3_encontrarPastaFilmes() {
        confirmar("Passo 3: Encontrar a pasta de filmes antigos");
        pastaFilmesEncontrada = true;
        System.out.println("✔️ Pasta de filmes antigos localizada.");
    }

    static void passo4_conectarPendrive() {
        confirmar("Passo 4: Conectar o pendrive ao computador");
        pendriveConectado = true;
        System.out.println("✔️ Pendrive conectado.");
    }

    static void passo5_verificarEspaco() {
        confirmar("Passo 5: Verificar se há espaço disponível no pendrive");
        int espacoDisponivel = ESPACO_TOTAL - pendrive.size();
        System.out.println("📦 Espaço disponível: " + espacoDisponivel + " filmes.");
        if (espacoDisponivel == 0) {
            confirmar("Sem espaço disponível. Deseja liberar espaço?");
            pendrive.clear();
            System.out.println("🧹 Espaço liberado.");
        }
        espacoVerificado = true;
    }

    static void passo6_copiarFilmes() {
        confirmar("Passo 6: Copiar os filmes antigos para o pendrive");
        pendrive.clear();
        pendrive.addAll(filmesAntigos);
        filmesCopiados = true;
        System.out.println("✔️ Filmes copiados para o pendrive.");
    }

    static void passo7_desconectarPendrive() {
        confirmar("Passo 7: Desconectar o pendrive do computador");
        pendriveConectado = false;
        pendriveDesconectado = true;
        System.out.println("✔️ Pendrive desconectado.");
    }

    static void passo8_conectarNaTV() {
        confirmar("Passo 8: Conectar o pendrive na TV");
        pendriveNaTV = true;
        System.out.println("✔️ Pendrive conectado na TV.");
    }

    static void passo9_escolherFilme() {
        confirmar("Passo 9: Escolher o filme desejado");
        System.out.println("🎞️ Filmes disponíveis:");
        for (int i = 0; i < pendrive.size(); i++) {
            System.out.println((i + 1) + ". " + pendrive.get(i));
        }
        System.out.print("Digite o número do filme: ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        if (escolha >= 1 && escolha <= pendrive.size()) {
            System.out.println("🎬 Filme escolhido: " + pendrive.get(escolha - 1));
            filmeEscolhido = true;
        } else {
            System.out.println("❌ Escolha inválida. Encerrando...");
            System.exit(0);
        }
    }

    static void passo10_darPlay() {
        confirmar("Passo 10: Dar play no filme");
        if (filmeEscolhido) {
            System.out.println("▶️ Reproduzindo filme... Aproveite!");
        } else {
            System.out.println("❌ Nenhum filme escolhido.");
        }
    }
}
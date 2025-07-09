import java.util.Scanner;

public class novel {
    static class Scene {
        String testo;
        String[] opzioni;
        int[] prossimeScene;

        Scene(String testo, String[] opzioni, int[] prossimeScene) {
            this.testo = testo;
            this.opzioni = opzioni;
            this.prossimeScene = prossimeScene;
        }
    }
    // Metodo main per avviare il gioco
    public static void main(String[] args) {
        System.out.println("Hai mangiato come un maiale!");
        Scanner scanner = new Scanner(System.in);

        // Definizione delle scene base
        Scene[] scenes = new Scene[] {
            new Scene(
                "Ti svegli, devi andare in bagno.\n Cosa fai?",
                new String[]{"Accendi la luce", "Rimani a letto"},
                new int[]{1, 2}
            ),
            new Scene(
                "La luce si accende.\n Vedi la porta del bagno.\n Cosa fai?",
                new String[]{"Apri la porta", "Spegni la luce"},
                new int[]{3, 0}
            ),
            new Scene(
                "Rimani a letto.\n Stai per fartela sotto...",
                new String[]{"Alzati", "Ignora"},
                new int[]{1, 2}
            ),
            new Scene(
                "Hai aperto la porta e ti sei liberato!\n Tiri lo sciaquone e torni a letto.",
                new String[]{},
                new int[]{}
            )
        };
        // Inizializzazione della scena corrente e parte logica del gioco
        int scenaCorrente = 0;
        while (true) {
            Scene scena = scenes[scenaCorrente];
            System.out.println(scena.testo);
            if (scena.opzioni.length == 0) break;
            for (int i = 0; i < scena.opzioni.length; i++) {
                System.out.println((i + 1) + ". " + scena.opzioni[i]);
            }
            int scelta = -1;
            while (scelta < 1 || scelta > scena.opzioni.length) {
                System.out.print("Scegli: ");
                if (scanner.hasNextInt()) {
                    scelta = scanner.nextInt();
                } else {
                    scanner.next();
                }
            }
            scenaCorrente = scena.prossimeScene[scelta - 1];
        }
        scanner.close();
    }
}

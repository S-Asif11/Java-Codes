public class ArzKiyaHai {
    public static void printWithDelays(String line, int wordDelay, int lineDelay) {
        String[] words = line.split(" ");
        for (String word : words) {
            System.out.print(word + " ");
            try {
                Thread.sleep(wordDelay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println();
        try {
            Thread.sleep(lineDelay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        // You can adjust these delays (in milliseconds)
        int wordDelay = 300;  // delay between words
        int lineDelay = 800;  // delay between lines

        System.out.println("🎵 Arz Kiya Hai — Anuv Jain 🎵");
        System.out.println("--------------------------------");

        // Example — replace these with actual lyric lines:
        printWithDelays("", wordDelay, lineDelay);
        printWithDelays("", wordDelay, lineDelay);
        printWithDelays("Kaayar jo the ", wordDelay, lineDelay);
        printWithDelays("woh shaayar bane",wordDelay, lineDelay);
        printWithDelays("Ab kya-kya karen ", wordDelay, lineDelay);
        printWithDelays("ye ishq mein",wordDelay, lineDelay);
        printWithDelays("Naa kehte the kuchh jo,", wordDelay, lineDelay);
        printWithDelays("lage khoj mein",wordDelay, lineDelay);
        printWithDelays("Kya lafz chune, naye aashiq ye", wordDelay, lineDelay);
        printWithDelays("naye aashiq ye",wordDelay, lineDelay);
        printWithDelays("Ishq Mein Tere Hai Faiz Bane",wordDelay, lineDelay);

        // Add more lines here by calling printWithDelays(...) for each line.

        System.out.println("--------------------------------");
        System.out.println("🎶 End 🎶");
      }
}

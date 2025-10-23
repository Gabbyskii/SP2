public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author olga = new Author("Olga Ravn");

        PrintedBook celestine = new PrintedBook("Celestine", "SKØN", 140, 166);

        AudioBook celestineAudio = new AudioBook("Celestine", "SKØN", 192,140);

        System.out.println("Celestine points: " + celestine.calculatePoints());  // Test!
        System.out.println("Celestine royalty: " + celestine.calculateRoyalty());  // Test!

        olga.addTitle(celestine);
        olga.addTitle(celestineAudio);

        // 4. Beregn royalties
        double royalties = olga.calculateRoyalties();

        // 5. Udskriv resultat
        System.out.println(olga.getName() + ": " + royalties + " kr.");


    }
}

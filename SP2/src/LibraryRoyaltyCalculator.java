public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        //1. Authors
        Author a1 = new Author("\nOlga Ravn");
        Author a2 = new Author("\nRobert Kirkman");
        Author a3 = new Author("\nAllen B. Downey");

        //2. Books
        PrintedBook pb1 = new PrintedBook("Invincible", "TE",100, 208);
        PrintedBook pb2 = new PrintedBook("Think Java", "FAG",150, 280);
        PrintedBook cel = new PrintedBook("Celestine", "SKØN", 140, 166);
        AudioBook celAudio = new AudioBook("Celestine", "SKØN", 140,192);

        //3. Add book titles to authors
        a1.addTitle(cel);
        a1.addTitle(celAudio);
        a2.addTitle(pb1);
        a3.addTitle(pb2);

        //4. Calculate royalties
        double royalties = a1.calculateRoyalties();
        double royalties2 = a2.calculateRoyalties();
        double royalties3 = a3.calculateRoyalties();

        // 5. Printing results
        System.out.println(a1.getName() + "'s payment: " + royalties + " kr.");
        System.out.println(a2.getName() + "'s payment: " + royalties2 + " kr.");
        System.out.println(a3.getName() + "'s payment: " + royalties3 + " kr.");


    }
}

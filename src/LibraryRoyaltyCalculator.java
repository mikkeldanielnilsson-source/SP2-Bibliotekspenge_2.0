public class LibraryRoyaltyCalculator {

    public static void main (String [] args) {

        Author olgaRavn = new Author("Olga Ravn");

        PrintedBook celestineB = new PrintedBook("Celestine","SKØN",140,166);
        AudioBook celestineA = new AudioBook("Celestine", "SKØN",140,192);
        EBook jordnærEB = new EBook("Jordnær","FAG",97,50,205,360000,false);
        EAudioBook jordnærEA = new EAudioBook("Jordnær","FAG",97,50,205, 150);

        olgaRavn.addTitle(jordnærEB);
        olgaRavn.addTitle(celestineB);
        olgaRavn.addTitle(celestineA);
        olgaRavn.addTitle(jordnærEA);

        double totalRoyalties = olgaRavn.calculateRoyalties();

        System.out.println(olgaRavn.getName() + ": " + totalRoyalties + " kr");
    }
}

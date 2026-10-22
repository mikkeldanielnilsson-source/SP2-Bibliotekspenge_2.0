public class EAudioBook extends NetTitle implements  IAudioBook{

    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title,literatureType,availability,reach,use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes / 2) * convertLiteratureType() * getPseudoCopies();
    }

    @Override
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}

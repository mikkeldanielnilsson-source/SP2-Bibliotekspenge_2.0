public class EBook extends NetTitle {

    private int characters;
    private boolean isIllustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean isIllustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.isIllustrated = isIllustrated;
    }

    private double calculatePages() {
        if (isIllustrated) {
            return ((characters / 1800 + 20)* 1.1);
        } else {
            return characters / 1800 + 20;
        }
    }
    @Override
    protected double calculatePoints() {
        return calculatePages() * convertLiteratureType() * getPseudoCopies();
    }
}

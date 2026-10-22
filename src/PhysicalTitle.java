public abstract class PhysicalTitle extends Title {

    protected int copies;

    public PhysicalTitle(String title, String literature, int copies) {
        super(title, literature);
        this.copies = copies;
    }
}

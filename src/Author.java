import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double totalRoyalty = 0.0;

        for (Title title : titles) {
            totalRoyalty += title.calculateRoyalty();
        }
        return totalRoyalty;
    }

    public String getName() {
        return name;
    }
}

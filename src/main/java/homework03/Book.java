package homework03;

public class Book {
    private final String name;
    private final int numberOfpages;

    public Book(String name, int numberOfpages) {
        this.name = name;
        this.numberOfpages = numberOfpages;
    }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public String getName() {
        return name;
    }

    public void start() {
    }
}

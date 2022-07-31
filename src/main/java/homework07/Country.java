package homework07;

public class Country {
    private String nameOfCountry;


    public Country(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    @Override
    public String toString() {
        return this.nameOfCountry;
    }
}

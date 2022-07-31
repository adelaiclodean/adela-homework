package homework07;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String nameOfHobby;
    private int frequency;
    private List<Address> addresses=new ArrayList<>();
    private List<Country> countries=new ArrayList<>();


    public Hobby(String nameOfHobby, int frequency, List<Address> addresses) {
        this.nameOfHobby = nameOfHobby;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return this.nameOfHobby + ", frequency=" + frequency + ", Address=" + addresses;
    }

}

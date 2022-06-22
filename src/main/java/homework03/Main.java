package homework03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Novel("Baltagul", 350, "politist"));
        System.out.println("Add novel:Baltagul");
        books.add(new Novel("Morometii", 500, "social"));
        System.out.println("Add novel: Morometii");
        books.add(new ArtAlbum("Buchet", 2, "lucioasa"));
        System.out.println("Add art album: Buchet");
        books.add(new ArtAlbum("Flori", 3, "vintage"));
        System.out.println("Add art album: Flori");


        books.remove(new Novel("Baltagul", 350, "politist"));
        System.out.println("Deleted Baltagul");

        List<String> list = new ArrayList<>();
        list.add("Baltagul");
        list.add("Morometii");
        list.add("Buchet de flori");
        list.add("Pisica colorata");
        System.out.println("Display the list: " +list);
    }
}

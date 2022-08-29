package homework10;

import java.io.*;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Athlete> athletes = new TreeSet<>(new AthletesComparator());

        try (FileReader fileReader = new FileReader("adelaFile.csv")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] input = line.split(",");
                athletes.add(new Athlete(input[0], input[1], input[2], input[3], input[4], input[5], input[6]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Results: ");
        int i = 1;
        for (Athlete athlete : athletes) {
            System.out.println("Ranking " + i + ": " + athlete.getAthleteName());
            i++;
        }
    }
}
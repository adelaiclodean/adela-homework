package homework10;

import java.io.*;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Athlete> athletes = new TreeSet<>(new AthletesComparator());

        File f = new File("src/test/resources/adelaFile.csv");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] input = line.split(",");
                athletes.add(new Athlete(input[0], input[1], input[2], input[3], input[4], input[5], input[6]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File not accessible");
        }

        System.out.println("Results: ");
        int i = 1;
        for (Athlete athlete : athletes) {
            System.out.println("Ranking " + i + ": " + athlete.getAthleteName());
            i++;
        }
    }
}
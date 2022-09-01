package homework10;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AthleteTest {

    @Test
    public void test_get_total_time(){
        Athlete test=new Athlete("1","Adela","RO","20:27","xxoox","xooxo","xxxxo");
        assertEquals(test.getTotalTime(), 1287);
    }

    @Test
    public void test_get_athlete_name(){
        Athlete name=new Athlete("1","Natalia","IT","32:15","xxoox","xooxo","xxxxo");
        assertEquals(name.getAthleteName(), "Natalia");
    }
    @Test
    public void whenReadWithBufferedReader_thenCorrect()
            throws IOException {
        String expected_value = "hello adela";
        String file ="src/test/resources/adelaFile.csv";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();

        assertEquals(expected_value, currentLine);
    }
}
package homework10;

import junit.framework.TestCase;
import org.junit.Test;

public class AthleteTest extends TestCase {

    @Test
    public void test_get_total_time(){
        Athlete test=new Athlete("1","Adela","RO","20:27","xxoox","xooxo","xxxxo");
        assertEquals(test.getTotalTime(),1287);
    }

    @Test
    public void test_get_athlete_name(){
        Athlete name=new Athlete("1","Natalia","IT","32:15","xxoox","xooxo","xxxxo");
        assertEquals(name.getAthleteName(),"Natalia");
    }
}
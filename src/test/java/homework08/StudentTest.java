package homework08;

import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class StudentTest{

    @Test
    public void test_first_name_is_empty (){
        Student studentA = new Student("Adela", "Iclodean", LocalDate.parse("1992-02-15"),"Female","32525125");
        assertEquals("Adela", studentA.getFirstName());
    }

    @Test
    public void test_last_name_is_empty (){
        Student studentA = new Student("Adela", "Iclodean", LocalDate.parse("1992-02-15"),"Female","32525125");
        assertEquals("Iclodean", studentA.getLastName());
    }

    @Test
    public void test_get_age (){
        Student studentA=new Student("Adela", "Iclodean", LocalDate.parse("1992-02-15"),"Female","32525125");
        assertEquals(30,studentA.getAge() );
    }

    @Test
    public void test_date_of_birth_format (){
        Student studentA = new Student("Adela", "Iclodean", LocalDate.parse("2000-02-15"),"female","32525125");
        assertEquals(LocalDate.parse("2000-02-15"),studentA.getDateOfBirth());
    }

    @Test
    public void test_gender_format (){
        Student studentA = new Student("Adela", "Iclodean", LocalDate.parse("1992-02-15"),"Female","32525125");
        assertEquals("Female", studentA.getGender());
    }

}
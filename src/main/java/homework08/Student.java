package homework08;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import java.time.LocalDate;
import java.time.Period;

public class Student {

    private static final Logger LOG = (Logger) LogManager.getLogger(Student.class);

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String cnp;

    public Student(String firstName, String lastName,LocalDate dateOfBirth,String gender, String cnp) throws  IllegalArgumentException {

        if (firstName.isEmpty() || lastName.isEmpty()) {
            LOG.log(Level.ERROR, "Incorrect format for First Name or/and Last Name (first name and last name should not be empty)");
            throw new IllegalArgumentException("Incorrect format for First Name or/and Last Name (first name and last name should not be empty)");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
            this.gender = gender;
        } else {
            LOG.log(Level.ERROR, "Invalid gender format-The gender must be male/female or m/f (upper/lower case should both be accepted)");
            throw new IllegalArgumentException("Invalid gender format-The gender must be male/female or m/f (upper/lower case should both be accepted)");
        }
            if (!(dateOfBirth.getYear() > (LocalDate.parse("1900-01-01").getYear())) || !(dateOfBirth.getYear() < (LocalDate.parse("2022-01-01").getYear()))) {
            LOG.log(Level.ERROR,"Incorrect format for birth date, date of birth is not between 1900 and current year");
            throw new IllegalArgumentException("Incorrect format for birth date");
        } else {
            this.dateOfBirth = dateOfBirth;
        }

        this.cnp =cnp;
}

    public int getAge() {
        Period period = Period.between(dateOfBirth, LocalDate.now());
        return period.getYears();
    }
    public String getCnp() {
        return cnp;
    }

    public String getName() {
        return this.lastName + " " + this.firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getGender() {
        return gender;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
        public String toString() {
            return "Student: " +
                    "firstName=" + firstName +
                    ", lastName=" + lastName +
                    ", dateOfBirth=" + dateOfBirth +
                    ", gender=" + gender +
                    ", cnp=" + cnp;        }

}


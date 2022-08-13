package homework08;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import java.time.LocalDate;
import java.util.List;

public class Main {

    private static final Logger LOG = (Logger) LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IllegalAccessException {

            try {
                StudentRepository student = new StudentRepository();
                Student studentA = new Student("Adela", "Iclodean", LocalDate.parse("1992-02-15"),"female","2412515");
                student.addStudent(studentA);
                LOG.info("Adding a student "+studentA);
                System.out.println("Adding a student "+studentA);

                Student studentB = new Student("Natalia", "Iclodean", LocalDate.parse("1992-02-15"),"Female","23254658");
                student.addStudent(studentB);
                LOG.info("Adding a student "+studentB);
                System.out.println("Adding a student "+studentB);

                student.deleteStudent("");

                List<Student> st = student.retrieveStudentsByAge(30);
                for (int i = 0; i < st.size(); i++) {
                    System.out.println(st.get(i).getName());
                }

            } catch (IllegalArgumentException ex) {
                LOG.error("Exception ", ex);
            }
    }
}




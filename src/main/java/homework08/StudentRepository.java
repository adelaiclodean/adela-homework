package homework08;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private static final Logger LOG = (Logger) LogManager.getLogger(StudentRepository.class);
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        try {
            students.add(student);
        } catch (IllegalArgumentException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void deleteStudent(String cnp) {
        if (cnp.isEmpty()) {
            LOG.log(Level.ERROR, "ID is empty");
            throw new IllegalArgumentException("ID is empty");
        } else {
            Student studentToRemove = null;
            for (Student student : students) {
                if (student.getCnp().equals(cnp)) {
                    studentToRemove = student;
                    break;
                }
            }
            if (studentToRemove != null) {
                students.remove(studentToRemove);
            }
        }
    }

    public List<Student> retrieveStudentsByAge(int age) {
        List<Student> studentList = new ArrayList<>();

        for (Student student : students) {
            if (student.getAge() == age) {
                studentList.add(student);
            }
        }
        return studentList;
    }
}

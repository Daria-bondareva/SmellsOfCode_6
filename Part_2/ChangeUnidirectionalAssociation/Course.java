package CodeSmells_lab_6.Part_2.ChangeUnidirectionalAssociation;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private List<Student> enrolledStudents;

    public Course(String title) {
        this.title = title;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    // Додаткові методи...
}


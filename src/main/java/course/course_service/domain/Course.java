package course.course_service.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "course")
public class Course {

    @Id
    private String ID;

    private Instructor instructor;

    private String name;

    private List<Student> enrolledStudents;

    public Course() {
        enrolledStudents = new ArrayList<Student>();
    }

    public String getID() {
        return ID;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addStudent(Student student) {
        this.enrolledStudents.add(student);
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

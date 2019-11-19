package course.course_service.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Course {

    @Id
    private String ID;

    private Instructor instructor;

    private List<Student> enrolledStudents;

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

}

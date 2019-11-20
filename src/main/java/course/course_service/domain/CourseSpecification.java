package course.course_service.domain;

import java.util.List;
import java.util.UUID;

public class CourseSpecification {

    private String ID;
    private Instructor instructor;


    public CourseSpecification(Instructor instructor) {
        this.instructor = instructor;
        this.ID = UUID.randomUUID().toString();
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getID() {
        return ID;
    }
}

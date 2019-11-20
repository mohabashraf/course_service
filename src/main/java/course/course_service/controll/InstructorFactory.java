package course.course_service.controll;

import course.course_service.domain.Instructor;
import course.course_service.domain.InstructorSpecification;
import course.course_service.domain.Student;
import course.course_service.domain.StudentSpecification;
import org.springframework.stereotype.Component;

@Component
public class InstructorFactory {

    public Instructor createInstructor(InstructorSpecification specification){
        Instructor instructor = new Instructor();
        instructor.setName(specification.getName());
        instructor.setID(specification.getID());
        return instructor;
    }

}

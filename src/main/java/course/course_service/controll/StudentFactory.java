package course.course_service.controll;

import course.course_service.domain.Student;
import course.course_service.domain.StudentSpecification;
import org.springframework.stereotype.Component;

@Component
public class StudentFactory {

    public Student createStudent(StudentSpecification specification){
        Student student = new Student();
        student.setName(specification.getName());
        student.setID(specification.getID());
        return student;
    }

}

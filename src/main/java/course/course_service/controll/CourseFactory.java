package course.course_service.controll;

import course.course_service.domain.Course;
import course.course_service.domain.CourseSpecification;

public class CourseFactory {

    public Course createStudent(CourseSpecification specification){
        Student student = new Student();
        student.setName(specification.getName());
        student.setID(specification.getID());
        return student;
    }

}

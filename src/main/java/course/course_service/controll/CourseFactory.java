package course.course_service.controll;

import course.course_service.domain.Course;
import course.course_service.domain.CourseSpecification;
import org.springframework.stereotype.Component;

@Component
public class CourseFactory {

    public Course createCourse(CourseSpecification specification){
        Course course = new Course();
        course.setInstructor(specification.getInstructor());
        course.setID(specification.getID());
        return course;
    }

}

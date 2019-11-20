package course.course_service.controll;

import course.course_service.Repository.CourseRepository;
import course.course_service.domain.Course;
import course.course_service.domain.CourseSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CourseBuilder {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseFactory courseFactory;

    public Course createCourse(CourseSpecification specification){
        Course course = courseFactory.createCourse(specification);
        courseRepository.save(course);
        return course;
    }
}

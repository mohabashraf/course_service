package course.course_service.resources;

import course.course_service.controll.CourseBuilder;
import course.course_service.domain.Course;
import course.course_service.domain.CourseSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseRestController {

    @Autowired
    CourseBuilder courseBuilder;

    @PostMapping("/create")
    public ResponseEntity<String> createCourse(
            @RequestBody CourseSpecification courseSpecification)
    {
        Course course = courseBuilder.createCourse(courseSpecification);
        return ResponseEntity.ok(course.getInstructor().getName());
    }

}

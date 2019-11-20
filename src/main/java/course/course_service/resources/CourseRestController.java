package course.course_service.resources;

import course.course_service.controll.CourseBuilder;
import course.course_service.domain.Course;
import course.course_service.domain.CourseSpecification;
import course.course_service.domain.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseRestController {

    @Autowired
    CourseBuilder courseBuilder;

    @GetMapping("/list")
    public List<Course> listCourses(){
        return courseBuilder.retrieveCourses();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createCourse(
            @RequestBody CourseSpecification courseSpecification)
    {
        Course course = courseBuilder.createCourse(courseSpecification);
        return ResponseEntity.ok(course.getName());
    }

    @PutMapping("/add/instructor/{id}")
    public void addInstructorToCourse(
            @PathVariable("id") String courseID, @RequestBody String instructorID){
        courseBuilder.addInstructor(instructorID, courseID);
    }

    @PutMapping("/add/student/{id}")
    public ResponseEntity<String> addStudent(@PathVariable("id") String courseID, @RequestBody String studentID){
        courseBuilder.addStudent(studentID, courseID);
        return ResponseEntity.ok(courseID);
    }

}

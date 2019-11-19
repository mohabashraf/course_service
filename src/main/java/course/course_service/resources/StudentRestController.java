package course.course_service.resources;

import course.course_service.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

    @Autowired
    Student student;

    @GetMapping("/test")
    public String getStudent(){
        return "test get request";
    }
}

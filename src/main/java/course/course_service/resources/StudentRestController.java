package course.course_service.resources;

import course.course_service.controll.StudentBuilder;
import course.course_service.domain.Student;
import course.course_service.domain.StudentSpecification;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@RestController
public class StudentRestController {

    @Autowired
    StudentBuilder studentBuilder;

    @GetMapping("/list")
    public List<Student> getStudents()
    {
        return studentBuilder
                .retrieveAllStudents();
    }

    @PostMapping(path = "/add")
    public ResponseEntity<String> addStudent(
            @RequestBody StudentSpecification studentSpecification)
    {
        studentBuilder.addStudent(studentSpecification);
        return ResponseEntity
                .ok(studentBuilder
                        .addStudent(studentSpecification)
                        .getName());
    }
}

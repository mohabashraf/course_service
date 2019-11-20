package course.course_service.resources;

import course.course_service.controll.InstructorBuilder;
import course.course_service.domain.Instructor;
import course.course_service.domain.InstructorSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorRestController {
    @Autowired
    InstructorBuilder instructorBuilder;

    @GetMapping("/list")
    public List<Instructor> getAllInstructors(){
        return instructorBuilder.retrieveAllInstructors();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addInstructor(@RequestBody InstructorSpecification instructorSpecification){
        Instructor instructor = instructorBuilder.createInstructor(instructorSpecification);
        return ResponseEntity.ok(instructor.getName());
    }
}

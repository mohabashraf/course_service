package course.course_service.controll;

import course.course_service.Repository.InstructorRepository;
import course.course_service.domain.Instructor;
import course.course_service.domain.InstructorSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class InstructorBuilder {

    @Autowired
    InstructorFactory instructorFactory;

    @Autowired
    InstructorRepository instructorRepository;

    public Instructor createInstructor(InstructorSpecification specification){
        Instructor instructor = instructorFactory.createInstructor(specification);
        instructorRepository.save(instructor);
        return instructor;
    }

    public List<Instructor> retrieveAllInstructors(){
        return instructorRepository.findAll();
    }
}

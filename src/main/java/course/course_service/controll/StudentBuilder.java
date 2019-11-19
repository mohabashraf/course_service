package course.course_service.controll;

import course.course_service.Repository.StudentRepository;
import course.course_service.domain.Student;
import course.course_service.domain.StudentSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentBuilder {

    @Autowired
    StudentFactory studentFactory;

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(StudentSpecification studentSpecification){
        Student student = studentFactory.createStudent(studentSpecification);
        studentRepository.save(student);
        return student;
    }

    public List<Student> retrieveAllStudents(){
        return studentRepository.findAll();
    }


}

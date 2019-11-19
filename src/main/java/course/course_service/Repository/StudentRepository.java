package course.course_service.Repository;

import course.course_service.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentRepository extends MongoRepository<Student, String> {


}

package course.course_service.Repository;

import course.course_service.domain.Instructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface InstructorRepository extends MongoRepository<Instructor, String> {
}

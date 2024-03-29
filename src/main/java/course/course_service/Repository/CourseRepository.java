package course.course_service.Repository;

import course.course_service.domain.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface CourseRepository extends MongoRepository<Course, String> {

}

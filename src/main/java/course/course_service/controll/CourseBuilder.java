package course.course_service.controll;

import course.course_service.Repository.CourseRepository;
import course.course_service.Repository.InstructorRepository;
import course.course_service.Repository.StudentRepository;
import course.course_service.domain.Course;
import course.course_service.domain.CourseSpecification;
import course.course_service.domain.Instructor;
import course.course_service.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseBuilder {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    InstructorRepository instructorRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseFactory courseFactory;

    public Course createCourse(CourseSpecification specification){
        Course course = courseFactory.createCourse(specification);
        courseRepository.save(course);
        return course;
    }

    public void addInstructor(String instructorID, String courseID){
        Course course = courseRepository.findById(courseID).get();
        Instructor instructor = instructorRepository.findById(instructorID).get();
        course.setInstructor(instructor);
        courseRepository.save(course);
    }

    public void addStudent(String studentID, String courseID){
        Course course = courseRepository.findById(courseID).get();
        Student student = studentRepository.findById(studentID).get();
        course.addStudent(student);
        courseRepository.save(course);
    }

    public List<Course> retrieveCourses() {
        return courseRepository.findAll();
    }
}

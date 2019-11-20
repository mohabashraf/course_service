package course.course_service.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

public class CourseSpecification {

    private String ID;
    private String name;


    public CourseSpecification(@JsonProperty("name") String name) {
        this.name = name;
        this.ID = UUID.randomUUID().toString();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

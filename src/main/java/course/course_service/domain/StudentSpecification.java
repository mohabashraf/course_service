package course.course_service.domain;

import com.fasterxml.jackson.annotation.*;
import java.util.UUID;

public class StudentSpecification {

    private String name;
    private String ID;

    public StudentSpecification(@JsonProperty("name") String name) {
        this.name = name;
        this.ID = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }
}

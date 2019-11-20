package course.course_service.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class InstructorSpecification {

    private String name;
    private String ID;

    public InstructorSpecification(@JsonProperty("name") String name) {
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

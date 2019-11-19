package course.course_service.domain;

import com.fasterxml.jackson.annotation.*;


public class StudentSpecification {

    private String name;

    public StudentSpecification(@JsonProperty("name") String name) {
        this.name = name;
    }
    @JsonGetter
    public String getName() {
        return name;
    }
    @JsonSetter
    public void setName(String name) {
        this.name = name;
    }
}

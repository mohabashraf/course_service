package course.course_service.domain;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Id
    private String ID;

    private String name;

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

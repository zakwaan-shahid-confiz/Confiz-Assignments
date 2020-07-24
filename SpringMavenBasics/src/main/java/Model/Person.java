package Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    private Name fullName;

    public Person(Name name)
    {
        setFullName(name);
    }

    public Name getFullName() {
        return fullName;
    }

    public void setFullName(Name fullName) {
        this.fullName = fullName;
    }
}

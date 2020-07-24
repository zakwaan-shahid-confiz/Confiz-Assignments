package TestPackage;

import Congig.ApplicationConfig;
import Model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testing()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person person = context.getBean("person", Person.class);
        //assertEquals("Zakwaan Shahid", person.getFullName().toString());
        System.out.println("\nTest Output Line-1 : "+person.getFullName().toString()+"\n");
    }
}

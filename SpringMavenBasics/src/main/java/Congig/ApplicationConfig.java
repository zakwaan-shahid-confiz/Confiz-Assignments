package Congig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import Model.Name;
import Model.Person;

@Configuration
@ComponentScan(basePackageClasses = Person.class)
public class ApplicationConfig {

    @Bean(name="name")
    public Name getFullName() {
        return new Name("Zakwaan","Shahid");
    }
}

package by.arabienko.spring.springIntrodution.configuration;

import by.arabienko.spring.springIntrodution.bean.Person1;
import by.arabienko.spring.springIntrodution.bean.Pet;
import by.arabienko.spring.springIntrodution.bean.impl.CatImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("myApp.properties")
public class MyConfig2 {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new CatImpl();
    }

    @Bean
    public Person1 personBean(){
        return new Person1(catBean());
    }
}

package by.arabienko.spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Film {
    @Value("Malavita")
    private String name;
    @Value("Robert De Niro")
    private String producer;
    @Value("2005")
    private int year;

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }
}

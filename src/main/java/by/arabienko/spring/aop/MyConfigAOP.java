package by.arabienko.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("by.arabienko.spring.aop")
@EnableAspectJAutoProxy
public class MyConfigAOP {

}

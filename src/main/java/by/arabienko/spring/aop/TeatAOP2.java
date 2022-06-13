package by.arabienko.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeatAOP2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigAOP.class);
        MainLibrary library = context.getBean("libraryBean", MainLibrary.class);
        library.getBook();
        library.getMagazine();
        context.close();
    }
}

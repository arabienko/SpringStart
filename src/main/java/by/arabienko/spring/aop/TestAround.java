package by.arabienko.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAround {
    public static void main(String[] args) {
        System.out.println("main starts...");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);
        MainLibrary library = context.getBean("libraryBean", MainLibrary.class);
        String bookName = library.returnBook();
        System.out.println("Return book: "+bookName);
        context.close();
    }

}

package by.arabienko.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeatAOP1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfigAOP.class);
        MainLibrary library = context.getBean("libraryBean", MainLibrary.class);
        Book book = context.getBean("book",Book.class);
        library.getBookByBookClass(book);
        library.getBookByName("BOOKS");
       // library.getMagazine(2);
        context.close();
    }
}

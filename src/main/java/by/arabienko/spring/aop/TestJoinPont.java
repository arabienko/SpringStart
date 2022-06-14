package by.arabienko.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJoinPont {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfigAOP.class);
        Film film = context.getBean("film",Film.class);
        MainLibrary library = context.getBean("libraryBean",MainLibrary.class);
        library.getFilm();
        library.addFilm("Person", film);
        library.addMagazine();
        context.close();
    }
}

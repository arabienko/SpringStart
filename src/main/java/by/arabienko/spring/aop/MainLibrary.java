package by.arabienko.spring.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class MainLibrary extends AbstractLibrary {
    @Override
    public void getBook() {
        System.out.println("we get book from MainLibrary...");
        System.out.println("_______________________");
    }

    public void getBookByName(String bookName) {
        System.out.println("we get book from MainLibrary by name..." + bookName);
        System.out.println("_______________________");
    }

    public void getBookByBookClass(Book bookName) {
        System.out.println("we get book CLASS from MainLibrary by name..." + bookName.getName());
        System.out.println("_______________________");
    }

    public void getMagazine() {
        System.out.println("we get Magazine from MainLibrary...");
        System.out.println("_______________________");
    }

    public void returnBook() {
        System.out.println("Return book...");
        System.out.println("_______________________");
    }

    public void returnMagazine() {
        System.out.println("Return magazine...");
        System.out.println("_______________________");
    }

    public void addBook() {
        System.out.println("Add book...");
        System.out.println("_______________________");
    }

    public void addMagazine() {
        System.out.println("Add magazine...");
    }

    public void addFilm(String person_name, Film film) {
        System.out.println("Add Film...");
        System.out.println("_______________________");
    }

    public void returnFilm() {
        System.out.println("Return film...");
        System.out.println("_______________________");
    }

    public void getFilm() {
        System.out.println("we get Film from MainLibrary...");
        System.out.println("_______________________");
    }
}

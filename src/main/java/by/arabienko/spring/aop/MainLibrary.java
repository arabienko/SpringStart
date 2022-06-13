package by.arabienko.spring.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class MainLibrary extends AbstractLibrary {
   @Override
    public void getBook() {
        System.out.println("we get book from MainLibrary...");
    }

    public void getBookByName(String bookName) {
        System.out.println("we get book from MainLibrary by name..."+bookName);
    }
    public void getBookByBookClass(Book bookName) {
        System.out.println("we get book CLASS from MainLibrary by name..."+bookName.getName());
    }

    public void getMagazine(){
        System.out.println("we get Magazine from MainLibrary...");

    }

    public void returnBook(){
        System.out.println("Return book...");
    }

    public void returnMagazine(){
        System.out.println("Return magazine...");
    }

    public void addBook(){
        System.out.println("Add book...");
    }
    public void addMagazine(){
        System.out.println("Add magazine...");
    }
}

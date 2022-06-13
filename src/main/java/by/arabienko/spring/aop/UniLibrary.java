package by.arabienko.spring.aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{
    //@Override
    public void getBook() {
        System.out.println("get book from UniLibrary...");
    }
}

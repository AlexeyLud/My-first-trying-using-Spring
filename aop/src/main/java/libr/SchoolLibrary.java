package libr;

import org.springframework.stereotype.Component;

@Component("school-bean")
public class SchoolLibrary extends AbstractLibrary{

    //@Override
    public void getBook(){
        System.out.println("Я получил школьную книгу");
    }

    //@Override
    public void returnBook(){
        System.out.println("Я вернул школьную книгу");
    }

}

package libr;

import org.springframework.stereotype.Component;

@Component("lib-bean")
public class UniversityLibrary extends AbstractLibrary{
    //@Override
    public void getBook(){
        System.out.println("Я получил универскую книгу");
        System.out.println("-------------------------------------");
    }

    //@Override
    public void returnBook(){
        System.out.println("Я вернул универскую книгу");
        System.out.println("-------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Я получил универский журнал");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Я вернул универский журнал");
        System.out.println("-------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу");
        System.out.println("-------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал");
        System.out.println("-------------------------------------");
    }

}

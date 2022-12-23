package libr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = context.getBean("book-bean", Book.class);

        System.out.println("-------------------------------------------------University");
        UniversityLibrary universityLibrary = context.getBean("lib-bean", UniversityLibrary.class);

        universityLibrary.getBook();
        universityLibrary.addBook("Alex", book);
        universityLibrary.addMagazine();

//        universityLibrary.getBook();
//        universityLibrary.getMagazine();

//        System.out.println("\n-------------------------------------------------School");
//        SchoolLibrary schoolLibrary = context.getBean("school-bean", SchoolLibrary.class);
//        schoolLibrary.getBook();
//        schoolLibrary.returnBook();

        context.close();
    }
}

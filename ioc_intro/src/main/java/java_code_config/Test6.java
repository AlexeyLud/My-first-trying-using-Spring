package java_code_config;

import animals.Pet;
import depend_inject.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("getPerson", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Pet cat = context.getBean("getCat", Pet.class);
//        Pet cat2 = context.getBean("getCat", Pet.class);
        //cat.say();

        context.close();
    }
}

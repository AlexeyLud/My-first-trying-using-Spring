package annotations;

import animals.Cat;
import depend_inject.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigAndAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");

        Person person = context.getBean("person-bean", Person.class);
        person.callYourPet();
        System.out.println("Pers: " + person.getSurname() + " | " + person.getAge() + " years");

        //Cat cat = context.getBean("cat-bean", Cat.class);
        //cat.say();

        context.close();
    }
}

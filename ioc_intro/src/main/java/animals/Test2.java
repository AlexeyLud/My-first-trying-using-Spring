package animals;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        // IoC(Inversion of Control)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        Pet pet = context.getBean("pet", Pet.class);
        pet.say();
        context.close();
    }
}

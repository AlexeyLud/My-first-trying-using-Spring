package bean_scope;

import animals.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");
        // Bean Scope (Singleton and Prototype)
        Dog dog = context.getBean("pet-dog", Dog.class);
        //dog.setName("Belka");
        Dog dog2 = context.getBean("pet-dog", Dog.class);
        //dog2.setName("Strelka");
        //System.out.println(dog.getName());
        //System.out.println(dog2.getName());
        System.out.println("Переменные ссылаются на один и тот же объект? " + (dog==dog2));
        System.out.println(dog);
        System.out.println(dog2);

        context.close();

    }
}

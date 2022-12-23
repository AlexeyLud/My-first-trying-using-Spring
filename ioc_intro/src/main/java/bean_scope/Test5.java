package bean_scope;

import animals.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeContext.xml");
        // Bean Scope (init-method and destroy-method)
        Dog dog = context.getBean("pet-dog", Dog.class);

        // spring auto call "init-method"
        dog.say();
        // spring auto call "destroy-method"

        Dog dog2 = context.getBean("pet-dog", Dog.class);
        dog2.say();

        context.close();
    }
}

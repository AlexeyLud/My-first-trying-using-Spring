package depend_inject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
        //DI(Dependency Injection)

        //мы вручную внедряем Pet в Person(без Spring)
        //Pet pet = context.getBean("pet", Pet.class);
        //Person person = new Person(pet);

        //Spring сам создаёт и внедряет нужные нам бины
        Person person = context.getBean("person", Person.class);
        System.out.println("Person: "+ person.getSurname() + ", " + person.getAge() + " years");
        person.callYourPet();

        Person person2 = context.getBean("person2", Person.class);
        System.out.println("Person2: "+ person2.getSurname() + ", " + person2.getAge() + " years");
        person2.callYourPet();

        context.close();
    }
}

package depend_inject;

import animals.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("person-bean")
public class Person {
//    @Autowired
//    @Qualifier("cat-bean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set Surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set Age\n");
        this.age = age;
    }

//    public Person(){
//        System.out.println("Person bean is created");
//    }

    // pet -> setPet
    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

//    @Autowired
//    public Person(@Qualifier("cat-bean") Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my best friend");
        pet.say();
    }

}

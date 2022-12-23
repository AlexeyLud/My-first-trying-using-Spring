package animals;

import org.springframework.stereotype.Component;

//@Component("cat-bean")
public class Cat implements Pet {

    public Cat(){
        System.out.println("Cat bean is created");
    }

    @Override
    public void say(){
        System.out.println("Myow-myow");
    }
}

package java_code_config;

import animals.Cat;
import animals.Pet;
import depend_inject.Person;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:aplic.properties")
//@ComponentScan({"animals", "depend_inject"})
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet getCat(){ // 'getCat' - bean ID
        return new Cat();
    }

    @Bean
    public Person getPerson(){
        return new Person(getCat());
    }

}

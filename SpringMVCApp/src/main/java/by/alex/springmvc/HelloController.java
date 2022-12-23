package by.alex.springmvc;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Controller
public class HelloController {

    @GetMapping("/api")
    public String sayHello(){
        return "myf";
    }

    @GetMapping("/api/echo")
    public String echoStr(@RequestParam String m){
        return "Echo " + m;
    }

}

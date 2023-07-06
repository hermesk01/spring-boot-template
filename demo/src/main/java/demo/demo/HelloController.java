package demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping(value="hello")
    public String getHelloWorld() {
        return "Hello World";
    }
    
}

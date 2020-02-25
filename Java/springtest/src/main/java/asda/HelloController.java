package asda;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/greetings1")
    public String index1() {
        return "Greetings from Spring Boot 1!";
    }

    @RequestMapping("/greetings2")
    public String index2() {
        return "Greetings from Spring Boot! 2";
    }
}

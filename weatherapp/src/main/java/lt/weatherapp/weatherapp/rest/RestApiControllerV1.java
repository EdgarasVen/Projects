package lt.weatherapp.weatherapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Class represent api controller for restful application.
 *  Includes GET POST DELETE PUT methods
 *
 * @author  Edgaras Venzlauskas
 * @version 1.0
 *
 */

@RestController
public class RestApiControllerV1 {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

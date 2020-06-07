package lt.weatherapp.weatherapp.rest;

import lt.weatherapp.weatherapp.service.Repository;
import org.springframework.beans.factory.annotation.Autowired;
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
    private final Repository repository;

    @Autowired
    public RestApiControllerV1(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

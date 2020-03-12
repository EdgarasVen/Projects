package com.example.accessingdata;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final  CustomerRepository repository;

    @Autowired
    public Controller(CustomerRepository repository){
        this.repository=repository;
    }


    @GetMapping("/hello")
    public StringBuilder hello (){
        repository.save(new Customer("Jack", "Bauer"));
        repository.save(new Customer("Chloe", "O'Brian"));
        repository.save(new Customer("Kim", "Bauer"));
        repository.save(new Customer("David", "Palmer"));
        repository.save(new Customer("Michelle", "Dessler"));
        StringBuilder builder= new StringBuilder();
        for (Customer customer : repository.findAll()) {
            builder.append(customer.toString()).append(System.getProperty("line.separator"));
        }
        return builder;
    }
}

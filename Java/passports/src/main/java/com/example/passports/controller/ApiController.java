package com.example.passports.controller;

import com.example.passports.builder.Builder;
import com.example.passports.model.Passport;
import com.example.passports.model.Person;
import com.example.passports.service.ServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private ServiceDao repository;

    @GetMapping("/hello")
    public String hello (){
        return "Hello";
    }

    @GetMapping("/api/person")
    public List<Person> getAll (){
        return  repository.getAll();
    }

    @PostMapping("/api/person")
    public void postNewPersonAndPassport (@RequestBody final Builder builder ){
        Person person=builder.buildPerson();
        repository.addOne(person);
    }

    @DeleteMapping("/api/person/{id}")
    public void deletePerson(@PathVariable final Long id){
        repository.deleteById(id);
    }
}

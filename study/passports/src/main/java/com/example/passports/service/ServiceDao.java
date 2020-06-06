package com.example.passports.service;

import com.example.passports.model.Person;

import java.util.List;

public interface  ServiceDao  {

    List<Person> getAll();
    void addOne(Person person);
    void deleteById(Long id);

}

package com.example.passports.dao;

import com.example.passports.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface RepoPerson extends CrudRepository<Person, Long> {
}

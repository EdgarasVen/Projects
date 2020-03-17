package com.example.passports.service;

import com.example.passports.dao.RepoPassport;
import com.example.passports.dao.RepoPerson;
import com.example.passports.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDaoPersonController implements ServiceDao{

    @Autowired
    private RepoPerson repoPerson;
    @Autowired
    private RepoPassport repoPassport;

    @Override
    public List<Person> getAll() {
        return (List<Person>) repoPerson.findAll();
    }

    @Override
    public void addOne(Person person) {
        repoPerson.save(person);
    }

    @Override
    public void deleteById(Long id) {
        repoPerson.deleteById(id);
    }

}

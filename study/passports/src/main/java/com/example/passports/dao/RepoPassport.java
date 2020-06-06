package com.example.passports.dao;

import com.example.passports.model.Passport;
import org.springframework.data.repository.CrudRepository;

public interface RepoPassport extends CrudRepository<Passport,Long> {
}

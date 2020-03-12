package com.example.repo;

import com.example.springUsers.User;
import org.springframework.data.repository.CrudRepository;

public interface Repo  extends CrudRepository<User, Long> {
}

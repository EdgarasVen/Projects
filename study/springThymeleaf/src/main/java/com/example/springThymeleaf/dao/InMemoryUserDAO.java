package com.example.dao;

import com.example.springUsers.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryUserDAO implements UserDao {
    private final Map<String,User> users = new HashMap<>();

    @Override
    public List<User> getUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void createUser(User user) {
        users.put(user.getUsername(),user);
    }

    @Override
    public void deleteUser(String username) {
        users.remove(username);
    }
}

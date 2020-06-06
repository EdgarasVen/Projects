package com.example.controller;


import com.example.repo.Repo;
import com.example.springUsers.CreateUserCommand;
import com.example.springUsers.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(value = "user")
@RestController
public class UserController {

    @Autowired
    private Repo repository;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/users")
    @ApiOperation(value = "Get users", notes = "Returns registered users.")
    public List<User> userGet () {
        return (List<User>) repository.findAll();
    }

    @PostMapping("/api/users")
    @ApiOperation(value = "Add user", notes = "Adds user to list")
    public void createUser (@RequestBody final @Valid CreateUserCommand createUser){
        repository.save(
                new User(
                        createUser.getFirstName(),
                        createUser.getLastName(),
                        createUser.getEmail())
        );
    }

    @DeleteMapping("/api/users/{id}")
    @ApiOperation(value = "Delete users", notes = "Deletes user from list by id")
    public void deleteUser (@PathVariable final @Valid Long id){
        repository.deleteById(id);
    }

    @PutMapping("/api/users/{id}")
    @ApiOperation(value = "Update user", notes = "Update user from list by name")
    public void updateUser (@PathVariable final @Valid Long id,
                            @RequestBody final @Valid User updateUser){

        User user = repository.findById(id).orElse(
                new User(updateUser.getFirstName(),
                updateUser.getLastName(),
                updateUser.getEmail()));
        user.setFirstName(updateUser.getFirstName());
        user.setLastName(updateUser.getLastName());
        user.setEmail(updateUser.getEmail());
        repository.save(user);

    }
}

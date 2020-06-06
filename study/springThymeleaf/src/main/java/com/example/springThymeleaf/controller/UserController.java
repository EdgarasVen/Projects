package com.example.controller;

import com.example.dao.UserDao;
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
    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/api/users")
    @ApiOperation(value = "Get users", notes = "Returns registered users.")
    public List<User> userGet () {
        return userDao.getUsers();
    }

    @PostMapping("/api/users")
    @ApiOperation(value = "Add user", notes = "Adds user to list")
    public void createUser (@RequestBody final @Valid CreateUserCommand createUser){
        userDao.createUser(
                new User(createUser.getUsername(),
                        createUser.getFirstName(),
                        createUser.getLastName(),
                        createUser.getEmail())
        );
    }

    @DeleteMapping("/api/users/{username}")
    @ApiOperation(value = "Delete users", notes = "Deletes user from list by username")
    public void deleteUser (@PathVariable final @Valid String username){
        userDao.deleteUser(username);
    }

    @PutMapping("/api/users/{username}")
    @ApiOperation(value = "Update user", notes = "Update user from list by name")
    public void updateUser (@PathVariable final @Valid String username,
                            @RequestBody final @Valid User updateUser){

        userDao.deleteUser(username);
        userDao.createUser(updateUser);

    }
}

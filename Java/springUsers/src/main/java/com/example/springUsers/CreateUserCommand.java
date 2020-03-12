package com.example.springUsers;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class CreateUserCommand {


    @NotNull
    @Length(min=1,max=120)
    private String firstName;
    @NotNull
    @Length(min=1,max=120)
    private String lastName;
    @NotNull
    @Length(min=1,max=220)
    @Email
    private String email;


    public String getFirstName() {
        return firstName;

    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
    public String getLastName() {
        return lastName;

    }
    public void setLastName(String lastName) {
        this.lastName = lastName;

    }
    public String getEmail() {
        return email;

    }
    public void setEmail(String email) {
        this.email = email;

    }
}

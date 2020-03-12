package com.example.springUsers;

import javax.persistence.*;

@Entity
public final class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;

    protected User() {}

    public User(  String firstName, String lastName, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;

    }
    public String getLastName() {
        return lastName;

    }
    public String getEmail() {
        return email;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

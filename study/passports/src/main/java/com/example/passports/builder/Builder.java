package com.example.passports.builder;

import com.example.passports.model.Passport;
import com.example.passports.model.Person;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Builder {

    private String firstName;
    private String lastName;
    private String series;
    private String no;

    public Person buildPerson(){
        Person person = new Person(firstName,lastName);
        person.setPassport(buildPassport(person));
        return person;
    }

    public Passport buildPassport(Person person){
        Passport passport = new Passport(series,no);
        passport.setOwner(person);
        return passport;
    }

}

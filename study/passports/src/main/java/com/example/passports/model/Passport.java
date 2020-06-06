package com.example.passports.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
public class Passport {

    @Column (name = "series")
    private String series;
    @Id
    @Column(name= "no")
    private String no;
    @OneToOne(optional = false, mappedBy = "passport")
    private Person owner;

    public Passport() {

    }

    public Passport(String series, String no) {
        this.series = series;
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Passport{" +
                ", series='" + series + '\'' +
                ", no='" + no + '\'' +
                ", owner=" + owner.getFirstName() +
                '}';
    }
}

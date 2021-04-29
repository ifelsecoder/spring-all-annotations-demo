package com.example.annotations.database.sqlite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Person {
    private static final String ANNOTATIONS = " [ANNOTATIONS:  " +
                                                    "@Entity, @Id, @GeneratedValue" +
                                                "]";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
 
    private String firstname;
    private String lastname;
    private String fullname;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getFirstname() {
        return firstname;
    }
 
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
 
    public String getFullname() {
        return fullname;
    }
 
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String toString() {
        return "Person => Firstname: " + firstname + ", Lastname: " + lastname +
               ", Fullname: " + fullname + ANNOTATIONS;
    }
}

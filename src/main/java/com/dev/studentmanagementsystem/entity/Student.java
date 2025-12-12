package com.dev.studentmanagementsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    // Student an Entity having
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", nullable = false) //for custom name and not null
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    private String email; //will create column name as of the field i.e. email if not assigned

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
    public Student (){

    }

    public Student(String firstName, String lastName, String email) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
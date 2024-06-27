package com.cabdriver.Cab.Driver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    // @Entity Annotation will convert Customer Model in our application code to
    // Customer Table in our Database
    @Id
    private Integer id;
    private Integer age;
    private String password;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(unique = true, nullable = false)
    private Long phoneNumber;
    private String address;
}

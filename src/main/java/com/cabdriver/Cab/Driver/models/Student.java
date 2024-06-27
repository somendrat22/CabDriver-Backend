package com.cabdriver.Cab.Driver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Student {
    @Id
    int id;
    String name;
    String className;
    @OneToMany(mappedBy = "student")
    List<Laptop> laptop;

    public Student() {
    }

    public Student(int id, String name, String className, List<Laptop> laptop) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.laptop = laptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

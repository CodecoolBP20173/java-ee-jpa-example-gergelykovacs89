package com.codecool.jpaexample.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Class")
public class Klass {

    @Id
    private String name;


    @OneToMany(mappedBy = "klass")
    private Set<Student> students = new HashSet<>();

    @Enumerated(EnumType.STRING)
    CCLocation ccLocation;

    public Klass() {}

    public Klass(String name, CCLocation ccLocation) {
        this.name = name;
        this.ccLocation = ccLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setKlass(this);
    }

}

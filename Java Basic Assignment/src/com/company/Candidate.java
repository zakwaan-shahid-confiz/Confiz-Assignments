package com.company;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate implements Serializable {
    private int id;
    private int age;
    private String name;
    private String gender;
    private String city;
    private Date dob;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display() {
        System.out.println(this.id+" "+this.name+" "+this.gender+" "+this.city+" "+this.age+" "+
                new SimpleDateFormat("dd/MM/yyyy").format(this.dob));
    }
}

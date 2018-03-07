package com.escuelita.java8.entity;

public class Person {


    private int id;

    private String name;

    private int age;

    private String civilStatus;

    private String gender;

    private String occupation;


    public Person(int id, String name, int age, String civilStatus, String gender, String occupation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.civilStatus = civilStatus;
        this.gender = gender;
        this.occupation = occupation;
    }

    public Person() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }
}

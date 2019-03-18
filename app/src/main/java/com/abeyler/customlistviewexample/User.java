package com.abeyler.customlistviewexample;

public class User {

    // user variables
    private String name;
    private String surname;
    private boolean isFemale;

    // default constructor
    public User() {

    }

    public User(String name, String surname, boolean isFemale) {

        this.name = name;
        this.surname = surname;
        this.isFemale = isFemale;
    }

    // setter and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }
}
